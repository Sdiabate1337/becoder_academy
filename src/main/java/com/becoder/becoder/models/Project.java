package com.becoder.becoder.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(of = "id")
@Document(collection = "projects")
public class Project {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;

    // Additional methods
    public void markAsCompleted() {
        this.completed = true;
    }

    public void markAsIncomplete() {
        this.completed = false;
    }
}