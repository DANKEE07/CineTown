package es.safareyes.cinetown.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "genero", schema = "cinetown")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToMany(mappedBy = "generos")
    private List<Pelicula> peliculas;
}
