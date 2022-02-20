package com.example.spotifly.repository;

import com.example.spotifly.entity.TrackEntity;
import org.springframework.data.repository.CrudRepository;

public interface TrackRepo extends CrudRepository<TrackEntity, Long> {
}
