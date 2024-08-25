package com.quiz.quiz.service.services;

import com.quiz.quiz.service.entities.Quiz;

import java.util.List;

public interface QuizService {
    public Quiz CreateQuiz(Quiz quiz);
    public  Quiz GetQuiz(long id);
    public List<Quiz> getAll();
}
