package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class quizDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<quiz> findAll() {
	String sql = "SELECT id, title FROM quizzes";
        RowMapper<quiz> rowMapper = new QuizRowMapper();
        return jdbcTemplate.query(sql, rowMapper);
    }
}
