package com.clouddrive.user.service;

import java.util.List;

import com.clouddrive.user.model.User;

public interface UserService {
	
	public User addUser(User user);
	
	public User getUserById(String userId);
	
	public User updateUser(User user);
	
	public String deleteUserById(String userId);

	public List<User> listAllUser();
}
