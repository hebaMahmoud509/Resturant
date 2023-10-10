package com.resturant.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Resturants {

	@Id
	private Long resturant_id;

	private String name;
	private String discription;
	private String location;

	private LocalDate created_at;
	private LocalDate update_at;

	public Resturants() {
		super();
	}

	public Resturants(Long resturant_id, String name, String discription, String location, LocalDate created_at,
			LocalDate update_at) {
		super();
		this.resturant_id = resturant_id;
		this.name = name;
		this.discription = discription;
		this.location = location;
		this.created_at = created_at;
		this.update_at = update_at;
	}

	public Long getResturant_id() {
		return resturant_id;
	}

	public void setResturant_id(Long resturant_id) {
		this.resturant_id = resturant_id;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
		return "Resturants [resturant_id=" + resturant_id + ", name=" + name + ", discription=" + discription
				+ ", location=" + location + ", created_at=" + created_at + ", update_at=" + update_at + "]";
	}

}
