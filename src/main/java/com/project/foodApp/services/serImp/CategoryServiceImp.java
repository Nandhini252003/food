package com.project.foodApp.services.serImp;

import com.project.foodApp.dao.CategoryDao;
import com.project.foodApp.dao.RecipeDao;
import com.project.foodApp.models.dto.CategoryDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Category;
import com.project.foodApp.models.entities.Recipe;
import com.project.foodApp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImp implements CategoryService {


    @Autowired
    public CategoryDao categoryDao;
    @Autowired
    public RecipeDao recipeDao;

    @Override
    public ResponseEntity<ResponseStructure<Category>> saveCategory(CategoryDto categoryDto, List<Integer> recipeId) {
        Category category = new Category();
        category.setCategoryName(categoryDto.getCategoryName());

        List<Recipe> recipes = new ArrayList<>();

        for (Integer recipeIds : recipeId) {
           // Optional<Recipe> optionalRecipe = recipeDao.findById(recipeId); // Find recipe by ID
           // if (optionalRecipe.isPresent()) {
           //      recipes.add(optionalRecipe.get());
            //System.out.println(".....");
            //} else {
                // Handle case where a recipe with the given ID is not found
            //    System.out.println("Recipe with ID " + recipeId + " not found.");
            }


        // Set the found recipes to the category
        category.setRecipes(recipes);


        ResponseStructure<Category> responseStructure = new ResponseStructure<>();
        responseStructure.setData(categoryDao.saveCategory(category));
        responseStructure.setMessage("category created");
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
    }
}
