package com.project.impl;


import com.project.api.quiz.ProjectQuiz;
import com.project.processor.DIService;

@DIService
public class ProjectQuizImpl implements ProjectQuiz {

    public void runQuiz() {
        System.out.println("Quiz started");
    }
}
