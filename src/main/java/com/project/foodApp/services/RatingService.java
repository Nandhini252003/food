package com.project.foodApp.services;

import com.project.foodApp.models.dto.RatingDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Rating;
import org.springframework.http.ResponseEntity;

public interface RatingService {
     ResponseEntity<ResponseStructure<Rating>> saveRating(RatingDto ratingDto, int recipeId);
}
