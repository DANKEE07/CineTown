package es.safareyes.cinetown.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sesion", schema = "cinetown")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "precio_base")
    private float PrecioBase;

    @Column(name = "fecha_hora_inicio")
    private LocalDateTime FechaHoraInicio;

    @Column(name = "fecha_hora_fin")
    private LocalDateTime FechaHoraFin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_sala", nullable = false)
    private Sala sala;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pelicula", nullable = false)
    private Pelicula pelicula;

    @OneToMany(mappedBy = "sesion")
    private List<Compra> compras = new ArrayList<>();
}
