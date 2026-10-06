package es.safareyes.cinetown.repositorios;

import es.safareyes.cinetown.modelos.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISesionRepository extends JpaRepository<Sesion, Long> {

    // Q1
    List<Sesion> findSesionByFechaHoraInicioAndFechaHoraFin(String fechaHoraInicio, String fechaHoraFin);

}
