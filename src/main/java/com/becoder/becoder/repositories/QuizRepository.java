package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.Quiz;

public interface QuizRepository extends MongoRepository<Quiz, String>{
    
}
