package com.becoder.becoder.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private String currentFormation;
    private List<Project> completedProjects;

     // Custom methods
    public void addCompletedProject(Project project) {
        completedProjects.add(project);
    }

    public void removeCompletedProject(Project project) {
        completedProjects.remove(project);
    }

    public boolean hasCompletedProject(Project project) {
        return completedProjects.contains(project);
    }

}