package com.quiz.model;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    @ManyToOne
    private Question originQuestion;


}
