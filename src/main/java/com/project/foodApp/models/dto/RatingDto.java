package com.project.foodApp.models.dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class RatingDto {
    private int score;
    private String comment;
}
