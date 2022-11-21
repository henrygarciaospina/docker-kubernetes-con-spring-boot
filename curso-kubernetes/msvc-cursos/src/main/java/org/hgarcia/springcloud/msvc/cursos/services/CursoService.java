package org.hgarcia.springcloud.msvc.cursos.services;

import org.hgarcia.springcloud.msvc.cursos.models.Usuario;
import org.hgarcia.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Optional<Curso> porIdConUsuarios(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
    void eliminarCursoUsuarioPorId(Long id);
    Optional<Usuario> asignarUsuario(Usuario usuario, Long curso_id);
    Optional<Usuario> crearUsuario(Usuario usuario, Long curso_id);
    /*
    * No se elimina el usuario físicamente, se elimina es la relación
    * del usuario con el curso, ya el usuario deja ser parte del curso
    * */
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);
}
