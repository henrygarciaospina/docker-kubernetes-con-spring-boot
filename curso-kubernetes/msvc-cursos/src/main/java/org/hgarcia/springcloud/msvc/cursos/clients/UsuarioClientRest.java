package org.hgarcia.springcloud.msvc.cursos.clients;

import org.hgarcia.springcloud.msvc.cursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="msvc-usuarios", url="localhost:8001")
public interface UsuarioClientRest {
    /* Métodos para consumir la api del microservicio msvc-usuarios*/
    @GetMapping("/{id}")
    Usuario detalle(@PathVariable Long id);

    @PostMapping("/")
    Usuario crear(@RequestBody Usuario usuario);

    @GetMapping("/usuarios-por-curso")
    List<Usuario> obtenerUsuariosPorCurso(@RequestParam Iterable<Long> ids);
}