package com.becoder.becoder.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

@Data
@EqualsAndHashCode(of = "id")
@Document(collection = "formations")
public class Formation {

    @Id
    private String id;
    private String title;
    private String description;
    private List<Course> courses;

    // Additional methods
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
}