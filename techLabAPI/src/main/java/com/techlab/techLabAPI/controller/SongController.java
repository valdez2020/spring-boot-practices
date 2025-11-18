package com.techlab.techLabAPI.controller;

import com.techlab.techLabAPI.model.Song;
import com.techlab.techLabAPI.service.SongService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SongController {

private SongService songService;

@Autowired
public SongController(SongService songService){
  this.songService = songService;
}


  @PostMapping("/songs")
  public Song createSong(@RequestBody Song song){
  return this.songService.createSong(song);
  }

  @GetMapping("/songs")
  public List<Song> showSongs(
      @RequestParam(required = false, defaultValue = "") String title,
      @RequestParam(required = false, defaultValue = "0") Integer duration
  ){
    return this.songService.showSongs(title, duration);
  }

@GetMapping("/songs/{id}")
  public Song findSongsById(@PathVariable int id){
  return this.songService.findSongsById(id);

};
}
