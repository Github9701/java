package com.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.entities.User;
import com.users.service.UserService;

@Controller
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id,@RequestBody User user) {
		return userService.updateUser(id, user);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}