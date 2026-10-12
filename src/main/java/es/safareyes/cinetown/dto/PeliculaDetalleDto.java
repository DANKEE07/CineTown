package es.safareyes.cinetown.dto;

import java.util.List;

// El "List" significa que contiene una lista de objetos con GeneroDto, así se puede representar una película que tenga uno, varios o ningún género
public record PeliculaDetalleDto(Integer id, boolean activo, int anio, String titulo, String clasificacion, int duracion, String sinopsis, List<GeneroDto> generos) {


}
