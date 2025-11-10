package com.clouddrive.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clouddrive.user.model.User;
import com.clouddrive.user.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUserById(userId);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/delete/{userId}")
	public String deleteUserById(@PathVariable String userId) {
		userService.deleteUserById(userId);
		return "User deleted of Id - "+userId;
	}
	
	@GetMapping("/list")
	public List<User> listAllUser(){
		return userService.listAllUser();
	}
	
}
