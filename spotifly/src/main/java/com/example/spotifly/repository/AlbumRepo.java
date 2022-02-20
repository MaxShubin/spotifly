package com.example.spotifly.repository;

import com.example.spotifly.entity.AlbumEntity;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepo extends CrudRepository<AlbumEntity, Long> {
}
