package com.clouddrive.user.service;

import com.clouddrive.user.model.User;

public interface UserService {
	
	public User addUser(User user);
	
	public User getUserById(String userId);

}
