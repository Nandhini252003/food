package com.project.foodApp.controllers;

import com.project.foodApp.models.dto.CategoryDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Category;
import com.project.foodApp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
	private CategoryService categoryService;

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Category>> saveCategory(@RequestBody CategoryDto categoryDto, @PathVariable List<Integer> recipeId){
		return categoryService.saveCategory(categoryDto,recipeId);
	}
}
