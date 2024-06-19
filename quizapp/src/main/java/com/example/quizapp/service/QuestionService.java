package com.example.quizapp.service;

import com.example.quizapp.dno.QuestionDno;
import com.example.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDno questionDno;

    public List<Question> getAllQuestions(){
        return questionDno.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDno.findByCategory(category);
    }
}
