package com.example.spotifly.controller;

import com.example.spotifly.entity.CategoryEntity;
import com.example.spotifly.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // Создание категории
    @PostMapping
    public ResponseEntity createCategories(@RequestBody CategoryEntity category,
                                        @RequestParam Long userId) {
        try {
            return ResponseEntity.ok(categoryService.createCategory(category, userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
