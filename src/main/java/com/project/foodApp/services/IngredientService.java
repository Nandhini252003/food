package com.project.foodApp.services;

import com.project.foodApp.models.dto.IngredientDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Ingredient;
import org.springframework.http.ResponseEntity;

public interface IngredientService {
    ResponseEntity<ResponseStructure<Ingredient>> createIngredients(IngredientDto ingredientsDto);
    ResponseEntity <ResponseStructure<String>> removeIngredients(int ingredeintsId);
    ResponseEntity<ResponseStructure<Ingredient>> updateIngredients(IngredientDto ingredientsDto,int ingredientsId);
}
