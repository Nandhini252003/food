package com.project.foodApp.dao.daoImp;

import com.project.foodApp.dao.CategoryDao;
import com.project.foodApp.models.entities.Category;
import com.project.foodApp.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImp implements CategoryDao {

    @Autowired
    private CategoryRepo categoryRepo;


    @Override
    public Category saveCategory(Category category) {
        return categoryRepo.save(category);
    }
}
