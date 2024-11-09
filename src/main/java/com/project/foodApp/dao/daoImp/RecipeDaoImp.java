package com.project.foodApp.dao.daoImp;

import com.project.foodApp.models.entities.Recipe;
import com.project.foodApp.repositories.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RecipeDaoImp {
    @Autowired
    private RecipeRepo reciperepo;

    public Recipe saveRecipe(Recipe recipe) {
        return reciperepo.save(recipe);
    }

    public Recipe updateRecipe(int id, Recipe recipe) {
        Optional<Recipe> existingRecipe = reciperepo.findById(id);
        if (existingRecipe.isPresent()) {
            recipe.setId(id);
            return reciperepo.save(recipe);
        }
        return null;
    }


    public Recipe getRecipeById(int id) {
        return reciperepo.findById(id).orElse(null);
    }


    public void deleteRecipe(int id) {
        reciperepo.deleteById(id);
    }
}



