package com.project.foodApp.controllers;

import com.project.foodApp.models.dto.RatingDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Rating;
import com.project.foodApp.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RatingController {

    @Autowired
    private RatingService ratingService;

    // Endpoint to save a new rating
    @PostMapping("/{recipeId}")
    public ResponseEntity<ResponseStructure<Rating>> saveRating(@RequestBody RatingDto ratingDto, @PathVariable int recipeId) {
        return ratingService.saveRating(ratingDto, recipeId);
    }
}
