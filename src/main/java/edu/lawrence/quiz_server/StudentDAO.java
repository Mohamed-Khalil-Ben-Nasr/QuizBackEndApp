
package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Student> findAll() {
	String sql = "SELECT id, name FROM students";
        RowMapper<Student> rowMapper = new StudentRowMapper();
        return jdbcTemplate.query(sql, rowMapper);
    }
    
}
