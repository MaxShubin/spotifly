package com.example.spotifly.model;

import com.example.spotifly.entity.ArtistEntity;
import com.example.spotifly.entity.TrackEntity;

public class Artist {
    private Long id;
    private String name;

    public static Artist toModel(ArtistEntity entity) {
        Artist model = new Artist();
        model.setId(entity.getId());
        model.setName(entity.getName());
        return model;
    }

    public Artist() {
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
}
