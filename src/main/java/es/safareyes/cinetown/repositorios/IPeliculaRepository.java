package es.safareyes.cinetown.repositorios;

import es.safareyes.cinetown.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {

    // Q1
    List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
    List<Pelicula> findByActivoTrueOrderByTituloAsc();
    List<Pelicula> findByClasificacion(String clasificacion);

    boolean existsByTitulo(String titulo);
}
