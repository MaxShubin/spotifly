package com.example.spotifly.controller;

import com.example.spotifly.entity.ArtistEntity;
import com.example.spotifly.entity.TrackEntity;
import com.example.spotifly.service.ArtistService;
import com.example.spotifly.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    // Создание альбома
    @PostMapping
    public ResponseEntity createArtist(@RequestBody ArtistEntity artist,
                                      @RequestParam Long trackId) {
        try {
            return ResponseEntity.ok(artistService.createArtist(artist, trackId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
