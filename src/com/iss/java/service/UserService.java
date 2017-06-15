package com.iss.java.service;

import java.util.List;


import com.iss.java.model.User;

public interface UserService {
	Boolean save(User user) ;
	Boolean isUserExist(String username);
	List<User> getAllUsers();
	User getUserByName(String username);
	
	
}
