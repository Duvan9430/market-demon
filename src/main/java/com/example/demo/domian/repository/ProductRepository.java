package com.example.demo.domian.repository;

import com.example.demo.domian.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategoria(int idCategoria);
    Optional<List<Product>> getByScarseProducts(int quantity);
    Optional<Product> getProduct(int productoId);
    Product save(Product product);
    void delete(int productoId);
}
