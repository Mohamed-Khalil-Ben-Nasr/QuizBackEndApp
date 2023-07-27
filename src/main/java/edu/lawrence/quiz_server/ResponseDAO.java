package edu.lawrence.quiz_server;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public String save(Response response) {
        String insertSQL = "INSERT INTO responses (student, question, response) values (?, ?, ?)";
        jdbcTemplate.update(insertSQL, response.getStudent(),response.getQuestion(), response.getResponse());
        return "success";
    }
    
}
