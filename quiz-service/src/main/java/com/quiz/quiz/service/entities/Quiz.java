package com.quiz.quiz.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String title;
    //adding transient will make sure it is not getting saved in database
    transient private List<Question> questions;
}
