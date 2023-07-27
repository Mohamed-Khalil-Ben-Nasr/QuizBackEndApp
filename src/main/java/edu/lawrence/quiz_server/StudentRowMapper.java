package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{
    @Override
    public Student mapRow(ResultSet row, int rowNum) throws SQLException {
        Student s = new Student();
        s.setId(row.getInt("id"));
        s.setName(row.getString("name"));
        return s;
    }
    
}
