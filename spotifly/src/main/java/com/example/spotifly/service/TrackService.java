package com.example.spotifly.service;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.entity.CategoryEntity;
import com.example.spotifly.entity.TrackEntity;
import com.example.spotifly.model.Album;
import com.example.spotifly.model.Track;
import com.example.spotifly.repository.AlbumRepo;
import com.example.spotifly.repository.TrackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackService {
    @Autowired
    private TrackRepo trackRepo;
    @Autowired
    private AlbumRepo albumRepo;

    // Добавление трека
    public Track createTrack(TrackEntity track, Long albumId) {
        AlbumEntity album = albumRepo.findById(albumId).get();
        track.setAlbum(album);
        return Track.toModel(trackRepo.save(track));
    }
}
