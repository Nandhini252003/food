package com.project.foodApp.dao;

import com.project.foodApp.models.entities.Recipe;

public interface RecipeDao {
    Recipe saveRecipe(Recipe recipe);
    Recipe updateRecipe(int id, Recipe recipe);
    Recipe getRecipeById(int id);
    void deleteRecipe(int id);

}
