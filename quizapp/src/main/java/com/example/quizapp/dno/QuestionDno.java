package com.example.quizapp.dno;

import com.example.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDno extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RANDOM() LIMIT :noQuestion", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int noQuestion);
}
