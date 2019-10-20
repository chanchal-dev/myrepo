package com.cp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cp.dao.UserDAO;
import com.cp.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public User saveUser(User user) {
		
		User user1 = userDAO.saveUser(user);
		return user1;
		
	}
	
	

}
