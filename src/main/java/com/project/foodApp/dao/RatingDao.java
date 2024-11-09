package com.project.foodApp.dao;

import com.project.foodApp.models.entities.Rating;
import jakarta.persistence.*;

import java.util.Optional;

public interface RatingDao{
        Rating saveRating(Rating rating);

}
