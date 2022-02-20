package com.example.spotifly.service;

import com.example.spotifly.entity.CategoryEntity;
import com.example.spotifly.entity.UserEntity;
import com.example.spotifly.model.Category;
import com.example.spotifly.repository.CategoryRepo;
import com.example.spotifly.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private UserRepo userRepo;

    // Добавление карегории
    public Category createCategory(CategoryEntity category, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        category.setUser(user);
        return Category.toModel(categoryRepo.save(category));
    }
}
