package main.java.com.example.crudapi.Entidade;

import java.lang.annotation.Inherited;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "tb_usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id_usuario;
    private String nome_usuario;

    public Usuario() {
    }

    public Usuario(UUID id_usuario, String nome_usuario) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
    }

    public UUID getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(UUID id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome;
    }

    public void setNome_usuario(String nome) {
        this.nome = nome;
    }
}
