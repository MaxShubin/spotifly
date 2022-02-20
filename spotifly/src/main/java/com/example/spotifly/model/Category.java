package com.example.spotifly.model;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.entity.CategoryEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Category {
    private Long id;
    private String name;
    private String title;
    private String image;
    private List<Album> albums;

    public static Category toModel(CategoryEntity entity) {
        Category model = new Category();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setTitle(entity.getTitle());
        model.setImage(entity.getImage());
        model.setAlbums(entity.getAlbums().stream().map(Album::toModel).collect(Collectors.toList()));
        return model;
    }

    public Category() {
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

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
