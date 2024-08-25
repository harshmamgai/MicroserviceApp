package com.question.question.service.Service;
import com.question.question.service.entity.Question;
import java.util.List;

public interface QuestionService {
     Question create(Question question);
    public Question get(long id);
     List<Question> getAll();

     List<Question> getByQuizId(long QuizId);
}
