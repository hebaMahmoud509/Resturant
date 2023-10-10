package com.resturant.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resturant.model.Users;
import com.resturant.repo.UsersRepo;

@Service
public class UsersServices {

	@Autowired
	private UsersRepo usersRepo;
	
	public void createUser(Users user) {
		usersRepo.save(user);
	}
	
	
	public void updateUser(Users entity) {
		
		Optional<Users> user =usersRepo.findById(entity.getId());
		if(user!=null)
			usersRepo.save(entity);
		else
			throw new IllegalArgumentException("not found users");
	}
	
	public Users findById(Long id) {
		
		return usersRepo.findById(id).orElseThrow();
		
	}
	
	
	
}
