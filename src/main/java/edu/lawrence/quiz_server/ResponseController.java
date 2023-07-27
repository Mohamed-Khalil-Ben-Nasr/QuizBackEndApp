
package edu.lawrence.quiz_server;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/responses")
@CrossOrigin(origins="*")
public class ResponseController {
    private ResponseDAO responseDAO;
    
    public ResponseController(ResponseDAO dao) {
        responseDAO = dao;
    }
    
    @PostMapping
    public String save(@RequestBody Response response) {
        return "\"" + responseDAO.save(response) + "\"";
    }
}
