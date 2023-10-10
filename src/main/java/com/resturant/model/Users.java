package com.resturant.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Users {

	@Id
	private Long id;
	

	private String userName;
	private String password;
	private String email;
	
	private Date created_at;
	private Date updated_at;
	public Users() {
			
		}
	public Users(Long id, String userName, String password, String email, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	
}
