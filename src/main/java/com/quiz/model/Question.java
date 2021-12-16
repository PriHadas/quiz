package com.quiz.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question{

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    @OneToMany
    private Set<Answer> answers;

    @OneToOne
    private Answer rightAnswer;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public Answer getRightAnswer() {
        return rightAnswer;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public void setRightAnswer(Answer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
