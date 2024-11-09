package com.project.foodApp.models.dto;

import com.project.foodApp.models.entities.Category;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
public class RecipeDto {
    private String title;
    private String description;
    private String steps;
    private String createdate;
    private int usersId;
    private List<Integer> categoryIds;
    private List<Integer> ingredientIds;

}
