package com.becoder.becoder.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(of = "id")
@Document(collection = "lessons")
public class Lesson {

    @Id
    private String id;
    private String title;
    private String content;

    // Additional methods
    public void updateContent(String newContent) {
        this.content = newContent;
    }
}