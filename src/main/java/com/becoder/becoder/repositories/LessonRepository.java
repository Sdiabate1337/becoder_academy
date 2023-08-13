package com.becoder.becoder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.becoder.becoder.models.Lesson;

public interface LessonRepository extends MongoRepository<Lesson, String> {
}
