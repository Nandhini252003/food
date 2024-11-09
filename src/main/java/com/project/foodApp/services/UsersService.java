package com.project.foodApp.services;

import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.dto.UsersDto;
import com.project.foodApp.models.entities.Users;
import org.springframework.http.ResponseEntity;

public interface UsersService {
    ResponseEntity<ResponseStructure<Users>> createUsers(UsersDto usersDto);

}
