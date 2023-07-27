package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
@CrossOrigin(origins="*")
public class QuestionController {
    private QuestionDAO questionDAO;
    
    public QuestionController(QuestionDAO dao) {
        this.questionDAO = dao;
    }
    
    @GetMapping(params={"quiz"})
    public List<Question> questionsByQuiz(@RequestParam int quiz) {
        return questionDAO.findByQuiz(quiz);
    }
    
}
