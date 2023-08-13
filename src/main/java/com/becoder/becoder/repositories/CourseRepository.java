package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
}
