package com.example.demo.web.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(schema = "public",name = "compras")
public class Compras implements Serializable {

    private static final long servialVersionIUD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compra;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_clientes",nullable = false,insertable = false,updatable = false)
    private Clientes id_categoria;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "medio_pago")
    private String medio_pago;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "estado")
    private Integer estado;

    @OneToMany(mappedBy = "id_compra")
    private List<ComprasProductos> listComprasProductos;
}
