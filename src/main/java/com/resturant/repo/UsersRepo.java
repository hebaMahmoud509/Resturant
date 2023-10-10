package com.resturant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resturant.model.Users;

public interface UsersRepo extends JpaRepository<Users, Long>{

}
