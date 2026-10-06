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
    private Integer id;

    @Column(name = "parking_usado")
    private boolean parkingUsado;

    @Column(name = "fecha_compra")
    private LocalDateTime fechaCompra;

    @Column(name = "num_entradas")
    private int numEntradas;

    @Column(name = "email")
    private String email;

    @Column(name = "precio_total")
    private float precioTotal;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_sesion")
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
