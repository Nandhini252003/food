package com.project.foodApp.services.serImp;

import com.project.foodApp.dao.RecipeDao;
import com.project.foodApp.models.dto.RecipeDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Recipe;
import com.project.foodApp.models.entities.Users;
import com.project.foodApp.repositories.CategoryRepo;
import com.project.foodApp.repositories.IngredientRepo;
import com.project.foodApp.repositories.UsersRepo;
import com.project.foodApp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeServiceImp  implements RecipeService {
    @Autowired
    private RecipeDao recipedao;
    @Autowired
    private UsersRepo userRepository;
    @Autowired
    private CategoryRepo categoryRepository;
    @Autowired
    private IngredientRepo ingredientRepository;
   // public ResponseEntity<Recipe> saveRecipe(int userId, RecipeDto recipeDto) {
//        Optional<Users> user = userRepository.findById(userId);
//        if (!user.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        Recipe recipe = new Recipe();
//        recipe.setTitle(recipeDto.getTitle());
//        recipe.setDescription(recipeDto.getDescription());
//        recipe.setSteps(recipeDto.getSteps());
//        recipe.setCreatedate(recipeDto.getCreatedate());
//        recipe.setUser(user.get());
//
//        List<Category> categories = categoryRepository.findById(recipeDto.getCategoryIds());
//        recipe.setCategories(categories);
//
//        List<Ingredient> ingredients = ingredientRepository.findById(recipeDto.getIngredientIds());
//        recipe.setIngredients(ingredients);
//
//        Recipe savedRecipe = recipeDao.saveRecipe(recipe);
//        return new ResponseEntity<>(savedRecipe, HttpStatus.CREATED);
//    }
//
//    @Override
//    public ResponseEntity<Recipe> updateRecipe(int id, RecipeDto recipeDto) {
//        Recipe recipe = recipeDao.getRecipeById(id);
//        if (recipe == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        recipe.setTitle(recipeDto.getTitle());
//        recipe.setDescription(recipeDto.getDescription());
//        recipe.setSteps(recipeDto.getSteps());
//        recipe.setCreatedate(recipeDto.getCreatedate());
//
//        List<Category> categories = categoryRepository.findById(recipeDto.getCategoryIds());
//        recipe.setCategories(categories);
//
//        List<Ingredient> ingredients = ingredientRepository.findById(recipeDto.getIngredientIds());
//        recipe.setIngredients(ingredients);
//
//        Recipe updatedRecipe = recipeDao.saveRecipe(recipe);
//        return new ResponseEntity<>(updatedRecipe, HttpStatus.OK);
//    }
//
//    @Override
//    public ResponseEntity<Recipe> getRecipeById(int id) {
//        Recipe recipe = recipeDao.getRecipeById(id);
//        return recipe != null ? new ResponseEntity<>(recipe, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @Override
//    public ResponseEntity<String> deleteRecipe(int id) {
//        Recipe recipe = recipeDao.getRecipeById(id);
//        if (recipe != null) {
//            recipeDao.deleteRecipe(id);
//            return new ResponseEntity<>("Recipe deleted successfully", HttpStatus.OK);
//        }
//        return new ResponseEntity<>("Recipe not found", HttpStatus.NOT_FOUND);
//    }



