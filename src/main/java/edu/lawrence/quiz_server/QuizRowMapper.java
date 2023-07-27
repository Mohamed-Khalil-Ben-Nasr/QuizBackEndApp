
package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuizRowMapper implements RowMapper<quiz>{
    @Override
    public quiz mapRow(ResultSet row, int rowNum) throws SQLException {
        quiz qz = new quiz();
        qz.setId(row.getInt("id"));
        qz.setTitle(row.getString("title"));
        return qz;
    }
}
