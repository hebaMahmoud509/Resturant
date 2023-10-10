package com.resturant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resturant.model.Orders;
import com.resturant.repo.OrdersRepo;

@Service
public class OrderServices {

	@Autowired
	private OrdersRepo  ordersRepo;
	
	public void createOrder(Orders order) {
		ordersRepo.save(order);
	}
	
	
	
	
	
}
