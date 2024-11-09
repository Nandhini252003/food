package com.project.foodApp.repositories;

import com.project.foodApp.models.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe,Integer> {

}
