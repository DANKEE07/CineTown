package es.safareyes.cinetown.controladores;

import es.safareyes.cinetown.dtos.PeliculaDTO;
import es.safareyes.cinetown.modelos.Pelicula;
import es.safareyes.cinetown.servicios.PeliculaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
@AllArgsConstructor

public class PeliculaController {

    @Autowired
    private PeliculaService service;

    @GetMapping("/{id}")
    public PeliculaDTO consultarPorId(@PathVariable Integer id) {
        return service.consultarPorIdConGeneros(id);
    }

    @GetMapping("/listar")
    public List<PeliculaDTO> consultarTodas() {
        return service.consultarTodas().stream().map(PeliculaDTO::of).toList();
    }
}
