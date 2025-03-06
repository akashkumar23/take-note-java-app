package com.akashkumar23.takenote.service;

import com.akashkumar23.takenote.entity.User;

public interface UserService {
	
	User saveUser(User user);
	
	boolean emailExistOrNot(String email);
	
	 public User getUserByEmail(String email);
	 
	 

}
