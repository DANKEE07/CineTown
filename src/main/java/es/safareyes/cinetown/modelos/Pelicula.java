package es.safareyes.cinetown.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pelicula", schema = "cinetown")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "activo")
    private Boolean Activo;

    @Column(name = "anio")
    private int Anio;

    @Column(name = "titulo")
    private String Titulo;

    @Column(name = "clasificacion")
    private String Clasificacion;

    @Column(name = "duracion")
    private int Duracion;

    @Column(name = "sinopsis")
    private String Sinopsis;
}
