package com.techlab.techLabAPI.repository;

import com.techlab.techLabAPI.model.Song;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {

  List<Song> songsDB = listaEjemplos();

  public List<Song> songsDB() {
//Agregar función que traiga los datos desde la base de datos
return songsDB;
  }
public Song saveSong(Song song){
    song.addId();
    songsDB.add(song);
    return song;
}

public List<Song> findByTitleAndDuration(String title, Integer duration){
    List<Song> FoundSongs = new ArrayList<>();
  List<Song> foundSongs = new ArrayList<>();

  for(Song song : songsDB){
    if(song.getTitulo().contains(title) && song.getDuracion() <= duration){foundSongs.add(song);}
  }

  return foundSongs;

}

public List<Song> findByTitle(String title){
  List<Song> foundSongs = new ArrayList<>();

  for(Song song : songsDB){
    if(song.getTitulo().contains(title)){foundSongs.add(song);}
  }

  return foundSongs;
}

public List<Song> findByDuration(Integer duration){
  List<Song> foundSongs = new ArrayList<>();

  for(Song song : songsDB){
    if(song.getDuracion() <= duration){foundSongs.add(song);}
  }

  return foundSongs;
  }



  public List<Song> listaEjemplos() {
    List<Song> songs = new ArrayList<>();

    songs.add(new Song("black swan", 200, "tema sobre la oscuridad interna"));
    songs.add(new Song("nothing else matters", 240, "tema de amor"));
    songs.add(new Song("nicaragua", 260, "dictaduras y guerras civiles"));
    songs.add(new Song("gasolina", 140, "reggaeton clásico de principios de los años 2000"));

    return songs;
  }
}