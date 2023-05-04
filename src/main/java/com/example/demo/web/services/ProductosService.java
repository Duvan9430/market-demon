package com.example.demo.web.services;

import com.example.demo.domian.Product;
import com.example.demo.web.Entities.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductosService {
    List<Product> getAll();

    List<Productos> findByIdCategoriaOrderByNombreAsc(Integer IdCategoria);

    Optional<List<Product>> findByCantidadLessThanAndEstado(Integer cantidad, Boolean estado);

    Optional<List<Product>> findByCategory(Integer categoriaId);

    Optional<Product> getProducto(Integer idProducto);

    Product save(Product productos);

    void delete(Integer idProducto);
}
