package com.example.demo.web.services.Impl;

import com.example.demo.domian.Product;
import com.example.demo.persistence.mapper.ProductMapper;
import com.example.demo.web.Entities.Productos;
import com.example.demo.web.repository.ProductosCrudRepository;
import com.example.demo.web.services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosServiceImpl implements ProductosService {

    @Autowired
    private ProductosCrudRepository productosServ;
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
         List<Productos> listaProductos = (List<Productos>) this.productosServ.findAll();
         return  mapper.toProducts(listaProductos);
    }

    @Override
    public List<Productos> findByIdCategoriaOrderByNombreAsc(Integer IdCategoria) {
        return this.productosServ.findByIdCategoriaOrderByNombreAsc(IdCategoria);
    }

    @Override
    public Optional<List<Product>> findByCantidadLessThanAndEstado(Integer cantidad, Boolean estado) {
        Optional<List<Productos>> optProductos = this.productosServ.findByCantidadLessThanAndEstado(cantidad,estado);
        return  optProductos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<List<Product>> findByCategory(Integer categoriaId) {
        List<Productos> listProduc =  this.productosServ.findByIdCategoriaOrderByNombreAsc(categoriaId);
        return Optional.of(mapper.toProducts(listProduc));
    }

    @Override
    public Optional<Product> getProducto(Integer idProducto) {
        return  this.productosServ.findById(idProducto).map(prod -> mapper.toProduct(prod));
    }

    @Override
    public Product save(Product productos) {
        Productos product = mapper.toProduct(productos);
        return mapper.toProduct(this.productosServ.save(product));
    }

    @Override
    public void delete(Integer idProducto) {
        this.productosServ.deleteById(idProducto);
    }


}
