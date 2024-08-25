package com.quiz.quiz.service.controller;
import com.quiz.quiz.service.entities.Quiz;
import com.quiz.quiz.service.services.QuizService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
  private final QuizService quizService;
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.CreateQuiz(quiz);
    }

    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable long id){
      return quizService.GetQuiz(id);
    }

  @GetMapping
  public List<Quiz> getQuiz(){
    return quizService.getAll();
  }
}
