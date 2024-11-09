package com.project.foodApp.services.serImp;

import com.project.foodApp.dao.UsersDao;
import com.project.foodApp.models.dto.ResponseStructure;
import com.project.foodApp.models.dto.UsersDto;
import com.project.foodApp.models.entities.Users;
import com.project.foodApp.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersDao usersDao;

    public ResponseEntity<ResponseStructure<Users>> createUsers(UsersDto usersDto) {
        Users users=new Users();
        users.setUsersname(usersDto.getUsersname());
        ResponseStructure<Users> responseStructure=new ResponseStructure<>();
        responseStructure.setData(usersDao.createUsers(users));
        responseStructure.setMessage("SUCCESS");
        responseStructure.setStatusCode(201);
        return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
    }

    }

