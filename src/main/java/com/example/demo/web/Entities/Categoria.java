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
@Table(schema = "public",name = "categorias")
public class Categoria implements Serializable{

    private static final long serialVersionIUD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

    @OneToMany(mappedBy = "id_categoria")
    private List<Productos> listProductos;
}
