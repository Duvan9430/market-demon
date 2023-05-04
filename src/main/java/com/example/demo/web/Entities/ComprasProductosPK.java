package com.example.demo.web.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter

@Embeddable
public class ComprasProductosPK implements Serializable
{
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name ="id_producto")
    private Integer idProducto;
}
