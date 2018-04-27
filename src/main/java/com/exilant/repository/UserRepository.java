package com.exilant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exilant.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
