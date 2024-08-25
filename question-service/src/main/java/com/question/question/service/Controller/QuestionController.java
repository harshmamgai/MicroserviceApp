package com.question.question.service.Controller;
import com.question.question.service.Service.ImplQuestionService;
import com.question.question.service.entity.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {

    private final ImplQuestionService implQuestionService;

    public QuestionController(ImplQuestionService implQuestionService) {
        this.implQuestionService = implQuestionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return implQuestionService.create(question);
    }

    @GetMapping("/{id}")
    public Question getById(@PathVariable long id){
        return implQuestionService.get(id);
    }

    @GetMapping
    public List<Question> getAll(){
        return implQuestionService.getAll();
    }

    @GetMapping("/quiz/{QuizId}")
    public List<Question> getAllByQuiz(@PathVariable long QuizId){
        return implQuestionService.getByQuizId(QuizId);
    }
}
