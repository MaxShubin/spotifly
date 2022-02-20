package com.example.spotifly.service;

import com.example.spotifly.entity.AlbumEntity;
import com.example.spotifly.entity.CategoryEntity;
import com.example.spotifly.model.Album;
import com.example.spotifly.model.Category;
import com.example.spotifly.repository.AlbumRepo;
import com.example.spotifly.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepo albumRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    // Добавление альбома
    public Album createAlbum(AlbumEntity album, Long categoryId) {
        CategoryEntity category = categoryRepo.findById(categoryId).get();
        album.setCategory(category);
        return Album.toModel(albumRepo.save(album));
    }
}
