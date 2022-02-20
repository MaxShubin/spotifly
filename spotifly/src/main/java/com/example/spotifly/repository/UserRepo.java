package com.example.spotifly.repository;

import com.example.spotifly.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository <UserEntity, Long> {
    UserEntity findByUsername(String username);
}
