package com.project.foodApp.controllers;

import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.dto.UsersDto;
import com.project.foodApp.models.entities.Users;
import com.project.foodApp.services.UsersService;
import com.project.foodApp.services.serImp.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UsersServiceImp usersimpl;

    @PostMapping("/save")
    ResponseEntity<ResponseStructure<Users>> createUsers(@RequestBody UsersDto usersDto){
        return usersimpl.createUsers(usersDto);
    }
}
