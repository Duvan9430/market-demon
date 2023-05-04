package com.example.demo.web.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(schema = "public" ,name = "clientes" )
public class Clientes implements Serializable {

    private static final long serialVersionIUD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private  String apellido;

    @Column(name = "celular")
    private Integer celular;

    @Column(name = "correo_electronico")
    private String correo_electronico;

    @OneToMany(mappedBy = "id_categoria")
    private List<Compras> ListCompras;

}
