package com.clouddrive.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clouddrive.user.model.User;

public interface UserRepository  extends MongoRepository<User, String>{

}
