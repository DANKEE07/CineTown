package es.safareyes.cinetown.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "compra", schema = "cinetown")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "parking_usado")
    private boolean ParkingUsado;

    @Column(name = "fecha_compra")
    private LocalDateTime FechaCompra;

    @Column(name = "num_entradas")
    private int NumEntradas;

    @Column(name = "email")
    private String Email;

    @Column(name = "precio_total")
    private float PrecioTotal;

    @Column(name = "estado")
    private String Estado;

    @ManyToOne
    @JoinColumn(name = "id_sesion")
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
