package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.Question;

public interface QuestionRepository extends MongoRepository<Question, String>{
    
}
