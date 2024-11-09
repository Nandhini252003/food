package com.project.foodApp.services;

import com.project.foodApp.models.dto.RecipeDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Recipe;
import org.springframework.http.ResponseEntity;

public interface RecipeService {
    ResponseEntity<Recipe> saveRecipe(int userId, RecipeDto recipeDto);
    ResponseEntity<Recipe> updateRecipe(int id, RecipeDto recipeDto);
    ResponseEntity<Recipe> getRecipeById(int id);
    ResponseEntity<String> deleteRecipe(int id);
}
