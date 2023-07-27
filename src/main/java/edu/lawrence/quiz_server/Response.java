
package edu.lawrence.quiz_server;

public class Response {
    private int id;
    private int student;
    private int question;
    private String response;
    
    public Response(){}

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
