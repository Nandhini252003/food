package com.project.foodApp.repositories;

import com.project.foodApp.models.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating,Integer> {

}
