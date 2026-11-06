package es.safareyes.cinetown.dtos;

import es.safareyes.cinetown.modelos.Pelicula;

public record PeliculaDTO(
        Integer id,
        String sinopsis
) {

    public static PeliculaDTO of(Pelicula pelicula) {
        return new PeliculaDTO(
                pelicula.getId(),
                pelicula.getSinopsis()
        );
    }
}
