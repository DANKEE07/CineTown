package es.safareyes.cinetown;

import es.safareyes.cinetown.modelos.Pelicula;
import es.safareyes.cinetown.repositorios.IPeliculaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RepositoriesTest {

    @Autowired
    private IPeliculaRepository peliculaRepository;

    @Test
    void probarConexion() {

        System.out.println("========== INICIO TEST ==========");

        long cantidad = peliculaRepository.count();

        System.out.println("Número de películas: " + cantidad);

        System.out.println("========== FIN TEST ==========");
    }

    @Test
    void buscarPorTitulo() {
        System.out.println("========== INICIO TEST 2 ==========");

        List<Pelicula> peliculas = peliculaRepository.buscarPorTitulo("%o");
        //IMPORTANTE -> Diferencia de mayúsculas (no es lo mismo (%A) que (%a))
        //buscarPorTitulo("%");       // Todas
        //buscarPorTitulo("A%");      // Empiezan por A
        //buscarPorTitulo("Av%");     // Empiezan por Av
        //buscarPorTitulo("%man%");   // Contienen "man"
        //buscarPorTitulo("%a");      // Terminan en "a"

        System.out.println("Número de películas encontradas: " + peliculas.size());

        System.out.println("========== FIN TEST 2 ==========");
    }

    @Test
    void buscarPorAnio() {
        System.out.println("========== INICIO TEST 3 ==========");

        List<Pelicula> peliculas = peliculaRepository.buscarPorAnio(2021);
        System.out.println("Número de películas encontradas: " + peliculas.size());

        System.out.println("========== FIN TEST 3 ==========");
    }

}
