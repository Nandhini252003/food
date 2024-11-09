package com.project.foodApp.models.entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;


@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoryName;

    @ManyToMany
    private List<Recipe> recipes;

}
