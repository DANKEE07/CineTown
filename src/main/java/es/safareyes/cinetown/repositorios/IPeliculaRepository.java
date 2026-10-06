package es.safareyes.cinetown.repositorios;

import es.safareyes.cinetown.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Integer> {
    @Query(value = "SELECT p FROM Pelicula p WHERE p.titulo LIKE :titulo")
    List<Pelicula> buscarPorTitulo(@Param("titulo") String titulo);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.anio > :anio")
    List<Pelicula> buscarPorAnio(@Param("anio") int anio);
}
