package com.techlabDB.PracticaDB.controller;

import com.techlabDB.PracticaDB.entity.Product;
import com.techlabDB.PracticaDB.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  private ProductRepository repository;

  public ProductController(ProductRepository repository) {
    this.repository = repository;
  }

  @PostMapping("/productos")
  public Product crearProducto(@RequestBody Product producto){
  return this.repository.save(producto);
}

@GetMapping("/productos")
  public List<Product> listarProductos(){
  return this.repository.findAll();
}
}
