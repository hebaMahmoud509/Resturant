package com.resturant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resturant.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Long>{

}
