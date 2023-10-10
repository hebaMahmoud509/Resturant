package com.resturant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resturant.model.Menus;
import com.resturant.repo.MenusRepo;

@Service
public class MenuServices {

	@Autowired
	private  MenusRepo menusRepo;
	
	
	public void createMenu(Menus menus) {
		menusRepo.save(menus);
	}
	
	public List<Menus> findAll(){
		return	menusRepo.findAll();
	}
	
	
	
	
}
