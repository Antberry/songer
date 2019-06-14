package com.yadayada1z2a.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {



    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album")
    public String getAllAlbums(Model model) {
        Iterable<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "Album";
    }
    @GetMapping("/album/new")
    public String addAlbums(Model model) {
        return "AlbumForm";
    }

    @GetMapping("/album/{title}")
    public String getAlbum(Model model, @PathVariable String title){
        List<Album> myAlbums = albumRepository.findByTitle(title);
        if(!myAlbums.isEmpty()){
            List<Song> mySongs = myAlbums.get(0).song;
            model.addAttribute("album", myAlbums.get(0));
        }
        return "SingleAlbum";
    }

    @PostMapping("/album")
    public RedirectView addAlbum(@RequestParam String title, @RequestParam String artist,
                                 @RequestParam String imgUrl, @RequestParam String lengthInSecs ,@RequestParam String songCount){
        Album album;
        try{
            album = new Album(title,artist,Integer.parseInt(songCount),Integer.parseInt(lengthInSecs),imgUrl);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            return new RedirectView("/album");
        }
        albumRepository.save(album);
        return new RedirectView("/album");
    }

    @PostMapping("/song")
    public RedirectView addSong(@RequestParam String title,@RequestParam String lengthInSecs,
                                @RequestParam String trackNumber ,@RequestParam String album){
        List<Album> theMatchingAlbum = albumRepository.findByTitle(album);
        Song song;

        if(theMatchingAlbum.size() > 0) {
            try{
                song = new Song(title,Integer.parseInt(lengthInSecs),Integer.parseInt(trackNumber), theMatchingAlbum.get(0));
            } catch (NumberFormatException e){
                e.printStackTrace();
                return new RedirectView("/song");
            }
            songRepository.save(song);

        }
        return new RedirectView("/song");
    }

    @Autowired
    SongRepository songRepository;

    @GetMapping("/song")
    public String getAllSongs(Model model){
        Iterable<Song> songs = songRepository.findAll();
        model.addAttribute("songs", songs);
        return "Songs";
    }
    @GetMapping("/song/new")
    public String addSongs(Model model){
        return "SongForm";
    }

}
