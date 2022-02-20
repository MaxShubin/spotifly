package com.example.spotifly.repository;

import com.example.spotifly.entity.ArtistEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepo extends CrudRepository<ArtistEntity, Long> {
}
