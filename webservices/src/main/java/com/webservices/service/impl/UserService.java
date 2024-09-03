package com.webservices.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.entities.User;
import com.webservices.repos.UserRepository;
import com.webservices.service.UserServiceInter;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserService implements UserServiceInter {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(int userid) {
		Optional<User> optionalUser = userRepo.findById(userid);
		return optionalUser.get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user) {
		User existingUser = userRepo.findById(user.getId()).get();
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setEmail(user.getEmail());
		User updateUser = userRepo.save(existingUser);
        return updateUser;		
	}

	@Override
	public void deleteUser(int userid) {
		 userRepo.deleteById(userid);
	}

}
