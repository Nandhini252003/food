package com.project.foodApp.repositories;


import com.project.foodApp.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
