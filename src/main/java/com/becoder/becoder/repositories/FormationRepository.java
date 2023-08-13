package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.Formation;

public interface FormationRepository extends MongoRepository<Formation, String> {
    
}
