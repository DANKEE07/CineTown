package es.safareyes.cinetown.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sala", schema = "cinetown")
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "numero", nullable = false)
    private int Numero;

    @Column(name = "capacidad", nullable = false)
    private int Capacidad;

    @OneToMany(mappedBy = "sala")
    private List<Sesion> sesiones = new ArrayList<>();
}
