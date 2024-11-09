package com.project.foodApp.dao.daoImp;




import com.project.foodApp.dao.IngredientDao;
import com.project.foodApp.exceptions.DataNotFoundException;
import com.project.foodApp.models.entities.Ingredient;
import com.project.foodApp.repositories.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Optional;

class IngredientDaoImp implements IngredientDao {
    @Autowired
    private IngredientRepo ingredientRepo;

    @Override
    public Ingredient createIngredients(Ingredient ingredients) {
        return ingredientRepo.save(ingredients);
    }

    @Override
    public Ingredient fetchById(int ingredientsId) {
        Optional<Ingredient> ingredients = ingredientRepo.findById(ingredientsId);
        if (ingredients != null) {
            return ingredients.get();

        } else {
            return new DataNotFoundException("Ingredients not found");
        }
    }

    @Override
    public String remove(Ingredient ingredients) {
        ingredientRepo.delete(ingredients);
        return "Ingredients not found";
    }

    @Override
    public Ingredient update(Ingredient ingredients, int ingredientsId) {
        Ingredient exisiting = fetchById(ingredientsId);

        return ingredientRepo.save(exisiting);
    }
}