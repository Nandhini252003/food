package com.project.foodApp.controllers;

import com.project.foodApp.models.dto.RecipeDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Recipe;
import com.project.foodApp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {
    @Autowired
    private RecipeService recipeservice;
    @PostMapping("/save/{userId}")
    public ResponseEntity<Recipe> saveRecipe(@PathVariable int userId, @RequestBody RecipeDto recipeDto) {
        return recipeservice.saveRecipe(userId, recipeDto);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable int id, @RequestBody RecipeDto recipeDto) {
        return recipeservice.updateRecipe(id, recipeDto);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable int id) {
        return recipeservice.getRecipeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRecipe(@PathVariable int id) {
        return recipeservice.deleteRecipe(id);
    }
}


