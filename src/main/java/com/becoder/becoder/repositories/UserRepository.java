package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
