package com.project.foodApp.dao.daoImp;

import com.project.foodApp.dao.UsersDao;
import com.project.foodApp.models.entities.Users;
import com.project.foodApp.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class  UsersDaoImp implements UsersDao {

    @Autowired
    private UsersRepo usersRespository;

    @Override
    public Users createUsers(Users users) {
        return usersRespository.save(users);
    }


}
