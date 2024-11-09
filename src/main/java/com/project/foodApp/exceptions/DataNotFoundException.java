package com.project.foodApp.exceptions;

import com.project.foodApp.models.entities.Ingredient;

public class DataNotFoundException extends Ingredient {
    String message;
    public DataNotFoundException(String message) {
        super();
    }
}
