package com.quiz.quiz.service.entities;
import lombok.Data;

@Data
public class Question {
    private long id;
    private String question;
    private long quizId;
}

