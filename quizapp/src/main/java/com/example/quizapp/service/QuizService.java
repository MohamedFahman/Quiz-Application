package com.example.quizapp.service;

import com.example.quizapp.dno.QuestionDno;
import com.example.quizapp.dno.QuizDao;
import com.example.quizapp.model.Question;
import com.example.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDno questionDno;

    public ResponseEntity<String> createQuiz(String category, int noQuestion, String title) {
        List<Question> questions = questionDno.findRandomQuestionsByCategory(category, noQuestion);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}