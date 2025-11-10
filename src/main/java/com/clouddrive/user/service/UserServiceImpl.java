package com.clouddrive.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clouddrive.user.model.User;
import com.clouddrive.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(String userId) {
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public User updateUser(User user) {
		User oldUser = getUserById(user.getId());
		oldUser.setEmail(user.getEmail());
		oldUser.setName(user.getName());
		return userRepository.save(user);
	}

	@Override
	public String deleteUserById(String userId) {
		userRepository.deleteById(userId);
		return userId;
	}

	@Override
	public List<User> listAllUser() {
		return userRepository.findAll();
	}

}
