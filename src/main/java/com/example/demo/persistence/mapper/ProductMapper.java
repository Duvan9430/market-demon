package com.example.demo.persistence.mapper;

import com.example.demo.domian.Product;
import com.example.demo.web.Entities.Productos;
import org.mapstruct.Mapper;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id_producto",target = "productoId"),
            @Mapping(source = "name",target = "nombre"),
            @Mapping(source = "idCategoria",target = "idCategoria"),
            @Mapping(source = "precio_venta",target = "price"),
            @Mapping(source = "cantidad",target = "stock"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "categoria",target = "category")
    })

    Product toProduct(Productos productos);
    List<Product> toProducts(List<Productos> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigo_barras",ignore = true)
    Productos toProduct(Product product);
}
