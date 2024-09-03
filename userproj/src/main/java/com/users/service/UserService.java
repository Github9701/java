package com.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.entities.User;
import com.users.repos.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	public User getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}
	public User updateUser(int userid,User user) {
		user.setUserId(userid);
		return userRepository.save(user);
	}
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
