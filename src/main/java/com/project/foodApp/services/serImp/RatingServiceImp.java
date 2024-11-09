package com.project.foodApp.services.serImp;

import com.project.foodApp.dao.RatingDao;
import com.project.foodApp.dao.RecipeDao;
import com.project.foodApp.models.dto.RatingDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Rating;
import com.project.foodApp.models.entities.Recipe;
import com.project.foodApp.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImp implements RatingService {
    @Autowired
    private RatingDao ratingDao;

    @Autowired
    private RecipeDao recipeDao;

    @Override
    public ResponseEntity<ResponseStructure<Rating>> saveRating(RatingDto ratingDto, int recipeId) {
//        Recipe foundRecipe = recipeDao.findByID(recipeId);
//
//        if (foundRecipe == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }

        Rating ratings = new Rating();
        ratings.setScore(ratingDto.getScore());
        ratings.setComment(ratingDto.getComment());
      //  ratings.setRecipe(foundRecipe);  // Set the associated recipe

        // Save the new rating
        ResponseStructure<Rating> responseStructure = new ResponseStructure<>();
        responseStructure.setStatusCode(HttpStatus.CREATED.value());
        responseStructure.setMessage("Rating saved successfully");
        responseStructure.setData(ratingDao.saveRating(ratings));

        return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
    }
}
