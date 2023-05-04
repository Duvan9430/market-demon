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
@Table(schema = "public",name = "productos")
public class Productos implements Serializable {
    private static final long serialVersionIUD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_categoria",nullable = false, insertable = false,updatable = false)
    private Categoria categoria;

    @Column(name = "codigo_barras")
    private String codigo_barras;

    @Column(name = "precio_venta")
    private Float precio_venta;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "estado")
    private Boolean estado;

    @OneToMany(mappedBy = "id_producto")
    private List<ComprasProductos> listComprasProductos;


}
