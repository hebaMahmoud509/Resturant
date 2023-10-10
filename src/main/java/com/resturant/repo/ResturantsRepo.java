package com.resturant.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resturant.model.Resturants;

public interface ResturantsRepo extends JpaRepository<Resturants, Long>{

	Optional<Resturants> update(Resturants resturants);

}
