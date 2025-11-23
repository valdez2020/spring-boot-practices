package com.practica_DB_mysql.pruebas._con.mySQL.service;

import com.practica_DB_mysql.pruebas._con.mySQL.entity.Product;
import com.practica_DB_mysql.pruebas._con.mySQL.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

@Autowired
  private ProductRepository repository;


  public Product crearProducto(Product producto){
    return this.repository.save(producto);
  }

  public Product actualizarProducto(Long id, Product productoActualizado){
    Product productoEncontrado = obtenerPorId(id);

    if(productoEncontrado != null){
      productoEncontrado.setNombre(productoActualizado.getNombre());
      productoEncontrado.setPrecio(productoActualizado.getPrecio());
      productoEncontrado.setDescripcion(productoActualizado.getDescripcion());

      return this.repository.save(productoEncontrado);
    }
    return null;
  }

  public boolean eliminarPorId(Long id){

    if(this.repository.existsById(id)){
      this.repository.deleteById(id);
    return true;
    }
    return false;
  }

  public List<Product> listarTodos(){
    return this.repository.findAll();
  }

  public Product obtenerPorId(Long id){
    return this.repository.findById(id).orElse(null);
  }

}
