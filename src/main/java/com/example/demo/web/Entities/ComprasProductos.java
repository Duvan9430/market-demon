package com.example.demo.web.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "compras_productos",schema = "public")
public class ComprasProductos implements Serializable {

    @EmbeddedId
    private ComprasProductosPK id;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_producto",nullable = false,insertable = false,updatable = false)
    private Productos id_producto;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_compra",nullable = false,insertable = false,updatable = false)
    private Compras id_compra;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private Float total;

    @Column(name = "estado")
    private Boolean estado;

}
