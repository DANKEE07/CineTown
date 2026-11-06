package es.safareyes.cinetown.servicios;

import es.safareyes.cinetown.dtos.PeliculaDTO;
import es.safareyes.cinetown.modelos.Pelicula;
import es.safareyes.cinetown.repositorios.IPeliculaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PeliculaService {

    private IPeliculaRepository repository;

    public PeliculaDTO consultarPorIdConGeneros(Integer id) {
        return repository.buscarPorIdConGeneros(id);
    }

    public List<Pelicula> consultarTodas() {
        return repository.findAll();
    }

}