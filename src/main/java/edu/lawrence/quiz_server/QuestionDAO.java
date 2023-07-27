package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Question> findByQuiz(int quiz) {
	String sql = "SELECT id, subject, question, choices, quiz FROM questions WHERE quiz=?";
        RowMapper<Question> rowMapper = new QuestionRowMapper();
        return jdbcTemplate.query(sql, rowMapper, quiz);
    }

}
