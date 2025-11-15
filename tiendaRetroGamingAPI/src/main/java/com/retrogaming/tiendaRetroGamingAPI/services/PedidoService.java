package com.retrogaming.tiendaRetroGamingAPI.services;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoService {

  @PutMapping
  public String agregarPedido(){
    return "Creando pedido";
  }

  @GetMapping
  public String listarPedidos(){

    return "Mostrando lista de pedidos";
  }

  @PatchMapping
  public String editarPedido(){
    return "Editando pedido";
  }

  @DeleteMapping
  public String eliminarPedido(){

    return "Eliminando pedido";
  }
}
