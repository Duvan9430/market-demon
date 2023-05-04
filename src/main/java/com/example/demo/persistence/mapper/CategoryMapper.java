package com.example.demo.persistence.mapper;

import com.example.demo.domian.Category;
import com.example.demo.web.Entities.Categoria;
import org.mapstruct.*;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "id_categoria", target = "categoriaId"),
            @Mapping(source = "descripcion", target = "categoria"),
            @Mapping(source = "estado", target = "active")

    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "listProductos",ignore = true)
    Categoria toCategory(Category category);
}
