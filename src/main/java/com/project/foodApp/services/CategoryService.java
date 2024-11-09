package com.project.foodApp.services;

import com.project.foodApp.models.dto.CategoryDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {

    public ResponseEntity<ResponseStructure<Category>> saveCategory(CategoryDto categoryDto, List<Integer> recipeId);
}
