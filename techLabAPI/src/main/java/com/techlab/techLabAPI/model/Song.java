package com.techlab.techLabAPI.model;

import com.techlab.techLabAPI.service.SongService;
import org.springframework.stereotype.Component;


public class Song {

  private int id;
  private static int nextId = 1;
  private String titulo;
  private int duracion;
  private String descripcion;

  public Song(){}

  public Song(String titulo, int duracion, String descripcion){
    this.addId();
    this.titulo = titulo;
    this.duracion = duracion;
    this.descripcion = descripcion;

  }

  public void addId(){
    this.id = nextId;
    nextId++;
  }

/// //// GETTERS ////////

  public String getTitulo() {
    return titulo;
  }

  public int getDuracion() {
    return duracion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getId() {
    return id;
  }

  public static int getNextId() {
    return nextId;
  }

  /// /// SETTERS //////

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public static void setNextId(int nextId) {
    Song.nextId = nextId;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}
