package com.project.foodApp.dao.daoImp;

import com.project.foodApp.dao.RatingDao;
import com.project.foodApp.models.entities.Rating;
import com.project.foodApp.repositories.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RatingDaoImp implements RatingDao {
    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepo.save(rating);
    }
}
