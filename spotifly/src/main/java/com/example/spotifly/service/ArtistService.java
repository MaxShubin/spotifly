package com.example.spotifly.service;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.entity.ArtistEntity;
import com.example.spotifly.entity.TrackEntity;
import com.example.spotifly.model.Artist;
import com.example.spotifly.model.Track;
import com.example.spotifly.repository.AlbumRepo;
import com.example.spotifly.repository.ArtistRepo;
import com.example.spotifly.repository.TrackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepo artistRepo;
    @Autowired
    private TrackRepo trackRepo;

    // Добавление артиста
    public Artist createArtist(ArtistEntity artist, Long trackId) {
        TrackEntity track = trackRepo.findById(trackId).get();
        artist.setTrack(track);
        return Artist.toModel(artistRepo.save(artist));
    }
}
