package com.practica_DB_mysql.pruebas._con.mySQL.controller;

import com.practica_DB_mysql.pruebas._con.mySQL.entity.Product;
import com.practica_DB_mysql.pruebas._con.mySQL.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  private ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @PostMapping("/productos")
  public Product crearProducto(@RequestBody Product producto) {
    return this.service.crearProducto(producto);
  }

  @PutMapping("/productos/{id}")
  public Product actualizarProducto(@PathVariable Long id, @RequestBody Product producto){
    return this.service.actualizarProducto(id, producto);
  }

  @GetMapping("/productos")
  public List<Product> listarProductos() {
    return this.service.listarTodos();
  }


  @GetMapping("/productos/{id}")
  public Product obtenerPorId(@PathVariable Long id) {
    return this.service.obtenerPorId(id);
  }

@DeleteMapping("/productos/{id}")
  public boolean eliminarPorId(@PathVariable Long id){
    return this.service.eliminarPorId(id);
}
}
