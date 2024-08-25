package com.quiz.quiz.service.services;
import com.quiz.quiz.service.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082",value = "Question-client")
public interface QuestionClient {
    //creating a method that we want to call from our Quiz service
    @GetMapping("/Question/quiz/{QuizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable long QuizId);
}
