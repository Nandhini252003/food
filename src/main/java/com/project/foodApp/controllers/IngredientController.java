package com.project.foodApp.controllers;


import com.project.foodApp.models.dto.IngredientDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Ingredient;
import com.project.foodApp.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/ingredient")
public class IngredientController {



        @Autowired
        private IngredientService ingredientsService;

        @PostMapping("/save")
        public ResponseEntity<ResponseStructure<Ingredient>> createIngredients(@RequestBody IngredientDto ingredientsDto) {
            return ingredientsService.createIngredients(ingredientsDto);
        }

        @DeleteMapping("/delete/{ingredientId}")
        public ResponseEntity<ResponseStructure<String>> remove(@PathVariable int ingredientsId) {
            return ingredientsService.removeIngredients(ingredientsId);

        }

        public ResponseEntity<ResponseStructure<Ingredient>> update(@RequestBody IngredientDto ingredientsDto, @PathVariable int ingredientsId) {
            return ingredientsService.updateIngredients(ingredientsDto, ingredientsId);
        }
    }