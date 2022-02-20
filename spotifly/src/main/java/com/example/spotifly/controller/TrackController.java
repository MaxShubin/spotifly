package com.example.spotifly.controller;

import com.example.spotifly.entity.TrackEntity;
import com.example.spotifly.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tracks")
public class TrackController {
    @Autowired
    private TrackService trackService;

    // Создание трека
    @PostMapping
    public ResponseEntity createTrack(@RequestBody TrackEntity track,
                                      @RequestParam Long albumId) {
        try {
            return ResponseEntity.ok(trackService.createTrack(track, albumId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
