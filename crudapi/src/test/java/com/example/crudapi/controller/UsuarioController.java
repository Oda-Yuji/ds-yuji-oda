package com.example.crudapi.controller;

import com.example.crudapi.model.Usuario;
import com.example.crudapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    // CREATE
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    // READ ALL
    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Optional<Usuario> buscar(@PathVariable Long id) {
        return repository.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        Usuario usuario = repository.findById(id).orElseThrow();
        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setEmail(usuarioAtualizado.getEmail());
        return repository.save(usuario);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}