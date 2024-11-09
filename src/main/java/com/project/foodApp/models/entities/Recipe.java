package com.project.foodApp.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String steps;
    private String createdate;
    @ManyToOne
    private Users user;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Category> categories;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)//Cascade delete for ratings
    private List<Rating> ratings;

    @OneToMany(cascade = CascadeType.ALL) // Ingredients cascade with recipe
    private List<Ingredient> ingredients;
}
