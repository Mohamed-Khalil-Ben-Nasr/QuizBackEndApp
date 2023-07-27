package edu.lawrence.quiz_server;

public class Question {
    private int id;
    private String subject;
    private String question;
    private String choices;
    private int quiz;
    
    public Question() {}
    
    public int getId() { return id; }
    public String getSubject() { return subject; }
    public String getQuestion() { return question; }
    public String getChoices() { return choices; }
    public int getQuiz() { return quiz; }
    
    public void setId(int id) { this.id = id; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setQuestion(String question) { this.question = question; }
    public void setChoices(String choices) { this.choices = choices; }
    public void setQuiz(int quiz) { this.quiz = quiz; }
}
