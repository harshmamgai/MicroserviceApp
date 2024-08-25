package com.quiz.quiz.service.services;
import com.quiz.quiz.service.entities.Quiz;
import com.quiz.quiz.service.repositories.QuizRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImplQuizService implements QuizService{
    private final QuizRepository quizRepository;
    private final QuestionClient questionClient;

    public ImplQuizService(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz CreateQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz GetQuiz(long id) {
        Quiz quiz= quizRepository.findById(id).orElseThrow(()->
                new RuntimeException("id not found for a quiz"));
         quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }

    @Override
    public List<Quiz> getAll() {
        List<Quiz> quizs=quizRepository.findAll();

        List<Quiz> newQuizList= quizs.stream().map(quiz->{
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    }
}
