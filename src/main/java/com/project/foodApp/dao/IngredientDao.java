package com.project.foodApp.dao;

import com.project.foodApp.models.entities.Ingredient;

public interface IngredientDao {


    Ingredient createIngredients(Ingredient ingredients);
    public Ingredient fetchById(int ingredientsId);
    String remove(Ingredient ingredients);
    Ingredient update(Ingredient ingredients,int ingredientsId);
}
