package com.resturant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resturant.model.Menus;

public interface MenusRepo extends JpaRepository<Menus, Long> {

}
