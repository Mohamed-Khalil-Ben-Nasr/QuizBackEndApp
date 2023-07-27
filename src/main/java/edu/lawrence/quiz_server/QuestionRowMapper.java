package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuestionRowMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet row, int rowNum) throws SQLException {
        Question q = new Question();
        q.setId(row.getInt("id"));
        q.setSubject(row.getString("subject"));
        q.setQuestion(row.getString("question"));
        q.setChoices(row.getString("choices"));
        q.setQuiz(row.getInt("quiz"));
        return q;
    }
}
