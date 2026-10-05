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
@ToString
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "nombre")
    private String Nombre;

    @ManyToMany(mappedBy = "Generos")
    private List<Pelicula> Peliculas;
}
