package main.java.com.example.crudapi.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tech.buildrun.rest.Entidade.Usuario;

@RepositoryRestResource(
    collectionResourceRel = "usuario", 
    path = "usuario"
)

public interface RepositorioRestUsuario extends CrudRepository<Usuario, UUID> {

}
