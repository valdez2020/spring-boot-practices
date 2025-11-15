package com.techlab.techLabAPI.service;

import com.techlab.techLabAPI.model.Song;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.stereotype.Service;

@Service
public class SongService {

  private final List<Song> songs = listaEjemplos();


  public Song createSong(Song song) {
    song.addId();
    songs.add(song);
    return song;
  }

  public List<Song> showSongs(){
    return this.songs;
  }

  public Song findSongsById(int id){
   Song songFound;
     songFound = songs.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    return songFound;
  }

  public List<Song> listaEjemplos(){
List<Song> songs = new ArrayList<>();

songs.add(new Song("black swan",200,"tema sobre la oscuridad interna"));
songs.add(new Song("nothing else matters",240,"tema de amor"));
songs.add(new Song("nicaragua",260,"dictaduras y guerras civiles"));
songs.add(new Song("gasolina",140,"reggaeton clásico de principios de los años 2000"));

return songs;
  }
}
