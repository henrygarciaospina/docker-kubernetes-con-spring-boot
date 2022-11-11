package org.hgarcia.springcloud.msvc.usuarios.Repositories;

import org.hgarcia.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
