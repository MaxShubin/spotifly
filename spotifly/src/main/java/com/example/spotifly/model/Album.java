package com.example.spotifly.model;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.entity.CategoryEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Album {
    private Long id;
    private String name;
    private String title;
    private String image;
    private List<Track> tracks;

    public static Album toModel(AlbumEntity entity) {
        Album model = new Album();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setTitle(entity.getTitle());
        model.setImage(entity.getImage());
        model.setTracks(entity.getTracks().stream().map(Track::toModel).collect(Collectors.toList()));
        return model;
    }

    public Album() {
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

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
