package com.resturant.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	private Long order_id;
	
	@ManyToOne
	private Resturants resturants;
	
	@ManyToOne
	private Users users;
	
	private String status;
	
	private LocalDate created_at;
	private LocalDate update_at;
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(Long order_id, Resturants resturants, Users users, String status, LocalDate created_at,
			LocalDate update_at) {
		super();
		this.order_id = order_id;
		this.resturants = resturants;
		this.users = users;
		this.status = status;
		this.created_at = created_at;
		this.update_at = update_at;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Resturants getResturants() {
		return resturants;
	}

	public void setResturants(Resturants resturants) {
		this.resturants = resturants;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "Orders [order_id=" + order_id + ", resturants=" + resturants + ", users=" + users + ", status=" + status
				+ ", created_at=" + created_at + ", update_at=" + update_at + "]";
	}
	
	
	
	
}
