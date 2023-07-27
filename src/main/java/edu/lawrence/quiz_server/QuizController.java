package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizzes")
@CrossOrigin(origins="*")
public class QuizController {
    private quizDAO qzDAO;
    
    public QuizController(quizDAO dao) {
        this.qzDAO = dao;
    }
    
    @GetMapping
    public List<quiz> findQuizzes() {
        return qzDAO.findAll();
    }
}
