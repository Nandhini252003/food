package com.project.foodApp.services.serImp;

import com.project.foodApp.dao.IngredientDao;
import com.project.foodApp.models.dto.IngredientDto;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.entities.Ingredient;
import com.project.foodApp.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImp implements IngredientService {
    @Autowired
    private IngredientDao ingredientsDao;
    @Override
    public ResponseEntity<ResponseStructure<Ingredient>> createIngredients(IngredientDto ingredientsDto) {
        Ingredient ingredients=new Ingredient();
        ingredients.setIngredientName(ingredients.getIngredientName());
        ingredients.setIngredientPrice(ingredients.getIngredientPrice());
        ingredients.setIngredientQuantity(ingredients.getIngredientQuantity());
        ResponseStructure<Ingredient> responseStructure=new ResponseStructure<>();
        responseStructure.setData(ingredients);
        responseStructure.setMessage("Ingredients added successfully");
        responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<ResponseStructure<String>> removeIngredients(int ingredeintsId) {
        Ingredient ingredients= ingredientsDao.fetchById(ingredeintsId);
        String result=ingredientsDao.remove(ingredients);
        ResponseStructure<String> responseStructure=new ResponseStructure<>();
        responseStructure.setData(result);
        responseStructure.setMessage("Ingredients not found");
        responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<ResponseStructure<Ingredient>> updateIngredients(IngredientDto ingredientsDto, int ingredientsId) {
        Ingredient ingredients1=ingredientsDao.fetchById(ingredientsId);
        if(ingredients1.getIngredientName()!=null){
            ingredients1.setIngredientName(ingredientsDto.getIngredientName());
        }
        if(ingredients1.getIngredientPrice()!=0){
            ingredients1.setIngredientPrice(ingredientsDto.getIngredientPrice());
        }
        if(ingredients1.getIngredientQuantity()!=0){
            ingredients1.setIngredientQuantity(ingredientsDto.getIngredientQuantity());
        }
        ResponseStructure<Ingredient> responseStructure=new ResponseStructure<>();
        responseStructure.setData(ingredients1);
        responseStructure.setMessage("Ingredients are updated");
        responseStructure.setStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<>(responseStructure,HttpStatus.OK);

    }
}
