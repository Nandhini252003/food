package com.project.foodApp.repositories;

import com.project.foodApp.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {
}
