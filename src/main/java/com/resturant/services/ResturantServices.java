package com.resturant.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resturant.model.Resturants;
import com.resturant.repo.ResturantsRepo;
@Service
public class ResturantServices {

	@Autowired
	private ResturantsRepo resturantsRepo;
	
	public void createResturant(Resturants resturants) {
		resturantsRepo.save(resturants);
	}
	
	public Optional<Resturants> updateResturant(Resturants entity) {
		Resturants resturants = resturantsRepo.findById(entity.getResturant_id()).orElseThrow();
		if(resturants!=null)
		return resturantsRepo.update( resturants);
		else
			throw new IllegalArgumentException("Not found resturant");
	}
	
	
	public List<Resturants> findAll(){
		return resturantsRepo.findAll();
	}
	
	public Resturants findById(Long id) {		
		return resturantsRepo.findById(id).orElseThrow();
	}
	

	
}
