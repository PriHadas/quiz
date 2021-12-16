package com.quiz.controller.rest;

import com.quiz.DAO.QuestionRepository;
import com.quiz.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class QuestionControllerREST {

    @Autowired
    private QuestionRepository questionRepository;


    @PostMapping("/addQuestion")
    public Question addQuestion(@RequestBody Question question){
        return questionRepository.save(question);
    }

    @GetMapping("/question")
    public Optional<Question> getQuestion(){
        return questionRepository.findById(1);
    }

}
