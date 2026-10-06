package es.safareyes.cinetown.repositorios;

import es.safareyes.cinetown.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    //Q1
    List<Usuario> findPasswordByUsername(String username);
}
