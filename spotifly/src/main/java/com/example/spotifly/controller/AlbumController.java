package com.example.spotifly.controller;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    // Создание альбома
    @PostMapping
    public ResponseEntity createAlbum(@RequestBody AlbumEntity album,
                                      @RequestParam Long categoryId) {
        try {
            return ResponseEntity.ok(albumService.createAlbum(album, categoryId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
