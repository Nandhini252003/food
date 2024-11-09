package com.project.foodApp.models.dto;

import lombok.Data;

@Data
public class IngredientDto {

    private String ingredientName;
    private int ingredientQuantity;
    private int ingredientPrice;

}
