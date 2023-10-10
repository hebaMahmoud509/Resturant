package com.resturant.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Menus {

	@Id
	private Long menu_id;
	
	@ManyToOne
	private Resturants resturants;
	
	private String name;
	private String discription;
	private double prices;
	
	private LocalDate created_at;
	private LocalDate update_at;
	
	
	
	public Menus() {
		super();
	}

	public Menus(Long menu_id, Resturants resturants, String name, String discription, double prices,
			LocalDate created_at, LocalDate update_at) {
		super();
		this.menu_id = menu_id;
		this.resturants = resturants;
		this.name = name;
		this.discription = discription;
		this.prices = prices;
		this.created_at = created_at;
		this.update_at = update_at;
	}

	public Long getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}

	public Resturants getResturants() {
		return resturants;
	}

	public void setResturants(Resturants resturants) {
		this.resturants = resturants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getPrices() {
		return prices;
	}

	public void setPrices(double prices) {
		this.prices = prices;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(LocalDate update_at) {
		this.update_at = update_at;
	}

	@Override
	public String toString() {
		return "Menus [menu_id=" + menu_id + ", resturants=" + resturants + ", name=" + name + ", discription="
				+ discription + ", prices=" + prices + ", created_at=" + created_at + ", update_at=" + update_at + "]";
	}
	
	
	
	

}
