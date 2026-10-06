package es.safareyes.cinetown;

import es.safareyes.cinetown.modelos.Pelicula;
import es.safareyes.cinetown.repositorios.IPeliculaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestRepositorioPelicula {

    @Autowired
    private IPeliculaRepository peliculaRepository;

    @Test
    void consultarPeliculasQueTenganLetraA() {

        List<Pelicula> peliculas = peliculaRepository.findByTituloContainingIgnoreCase("A");
    }
}