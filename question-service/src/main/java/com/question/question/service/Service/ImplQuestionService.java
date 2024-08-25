package com.question.question.service.Service;
import com.question.question.service.Repository.QuestionRepository;
import com.question.question.service.entity.Question;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImplQuestionService implements QuestionService {
    private final QuestionRepository questionRepository;

    public ImplQuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question get(long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException());
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getByQuizId(long QuizId){
        return questionRepository.findByQuizId(QuizId);
    }

}
