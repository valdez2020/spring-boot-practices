package com.retrogaming.tiendaRetroGamingAPI.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videojuegos")
public class VideoJuegoController {

@PutMapping
  public String agregarVideoJuego(){
 return "Creando videjuego";
}

@GetMapping
  public String listarVideoJuegos(){

  return "Mostrando lista de videojuegos";
}

@PatchMapping
  public String editarVideoJuego(){
  return "Editando videojuego";
}

@DeleteMapping
  public String eliminarVideoJuego(){

  return "Eliminando videojuego";
}

}
