package com.iss.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.java.dao.UserMapper;
import com.iss.java.model.User;
import com.iss.java.service.UserService;
@Service("UserService")
public class UserSeviceImpl implements UserService {
	@Autowired
	UserMapper  usermapper ;
	
	@Override
	public Boolean save(User user) {
	return	usermapper.insert(user)>0;                   
	}

	@Override
	public Boolean isUserExist(String username) {
		return usermapper.selectByUsername(username)!=null?true:false;
		
		
	}
	@Override
	public List<User> getAllUsers() {
		return usermapper.selectAllUsers();
		
	}

	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return usermapper.selectByUsername(username);
	}
}