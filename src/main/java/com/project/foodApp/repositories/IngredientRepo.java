package com.project.foodApp.repositories;

import com.project.foodApp.models.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo  extends JpaRepository<Ingredient, Integer> {

}

