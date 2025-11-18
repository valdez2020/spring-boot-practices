package com.techlab.techLabAPI.service;

import com.techlab.techLabAPI.model.Song;
import com.techlab.techLabAPI.repository.SongRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.stereotype.Service;

@Service
public class SongService {


  private SongRepository repository;
  public SongService(SongRepository repository){
    this.repository = repository;
  }

  public Song createSong(Song song) {

    return repository.saveSong(song);
  }

  public List<Song> showSongs(String title, Integer duration){

    if (!title.isEmpty() && duration > 0){
      return this.repository.findByTitleAndDuration(title,duration);}

    if(!title.isEmpty()){
      return this.repository.findByTitle(title);}

    if (duration > 0){
      return this.repository.findByDuration(duration);
    }

    return this.repository.songsDB();
  }

  public Song findSongsById(int id){
   Song songFound;
     songFound = this.repository.songsDB().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    return songFound;
  }


  }
