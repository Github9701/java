package com.webservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webservices.entities.User;
@Service
public interface UserServiceInter {
	User createUser(User user);
	
	User getUserById(int userid);
	
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	void deleteUser(int userid);

}
