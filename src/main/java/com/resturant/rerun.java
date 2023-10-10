package com.resturant;

import java.util.Date;


import com.resturant.model.Users;

public class rerun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users u = new Users();
		u.setId((long) 12);
		u.setEmail("Ibrahim@mail.com");
		u.setUserName("Ibrahim");
		u.setCreated_at(new Date());
		
		System.out.println(u.toString());
	}

}
