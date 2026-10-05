package es.safareyes.cinetown.modelos;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario", schema = "cinetown")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "username")
    private String Username;

    @Column(name = "password")
    private String Password;

    @OneToMany(mappedBy = "usuario")
    private List<Compra> compras = new ArrayList<>();
}
