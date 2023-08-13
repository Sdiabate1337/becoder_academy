package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.Project;

public interface ProjectRepository extends MongoRepository<Project, String>{
    
}
