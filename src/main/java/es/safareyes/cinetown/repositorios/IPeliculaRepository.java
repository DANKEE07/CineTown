package es.safareyes.cinetown.repositorios;

import es.safareyes.cinetown.modelos.Pelicula;
import es.safareyes.cinetown.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {

    List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
}
