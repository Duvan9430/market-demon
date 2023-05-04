package com.example.demo.web.repository;

import com.example.demo.web.Entities.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductosCrudRepository extends CrudRepository<Productos,Integer> {

    List<Productos> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);

    Optional<List<Productos>> findByCantidadLessThanAndEstado(Integer cantidad,Boolean estado);
}
