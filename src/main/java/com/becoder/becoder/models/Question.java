package com.becoder.becoder.models;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Question {

    private String question;
    private List<String> options;
    private int correctOption;

    // Additional methods
    public boolean isOptionCorrect(int selectedOption) {
        return selectedOption == correctOption;
    }
}