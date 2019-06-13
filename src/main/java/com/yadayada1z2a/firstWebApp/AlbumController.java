package com.yadayada1z2a.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album")
    public String getAllAblums(Model model) {
        Iterable<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "Album";
    }


}
