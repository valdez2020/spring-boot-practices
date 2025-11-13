package com.techlab.techLabAPI.controller;

import com.techlab.techLabAPI.model.Song;
import com.techlab.techLabAPI.service.SongService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/songs")
public class SongController {

private SongService songService;

@Autowired
public SongController(SongService songService){
  this.songService = songService;
}

  @PostMapping
  public Song createSong(@RequestBody Song song){
  return this.songService.createSong(song);
  }

  @GetMapping
  public List<Song> showSongs(){
    return this.songService.showSongs();
  }

  
}
