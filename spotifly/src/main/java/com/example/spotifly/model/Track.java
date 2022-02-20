package com.example.spotifly.model;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.entity.TrackEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Track {
    private Long id;
    private String name;
    private String title;
    private String image;
    private Double length;
    private List<Artist> artists;

    public static Track toModel(TrackEntity entity) {
        Track model = new Track();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setTitle(entity.getTitle());
        model.setImage(entity.getImage());
        model.setLength(entity.getLength());
        model.setArtists(entity.getArtists().stream().map(Artist::toModel).collect(Collectors.toList()));
        return model;
    }

    public Track() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
