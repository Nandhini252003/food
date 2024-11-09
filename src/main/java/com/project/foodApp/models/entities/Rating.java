package com.project.foodApp.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int score;
    private String comment;
    @ManyToOne
    @JoinColumn
    private Recipe recipe;
}
