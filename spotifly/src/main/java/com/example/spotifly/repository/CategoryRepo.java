package com.example.spotifly.repository;

import com.example.spotifly.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<CategoryEntity, Long> {
}
