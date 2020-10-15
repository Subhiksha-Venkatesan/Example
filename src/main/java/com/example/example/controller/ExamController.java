package com.example.example.controller;

import com.example.example.dao.ExamDaoImpl;
import com.example.example.model.Exam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2")
public class ExamController {

    private ExamDaoImpl examDaoImpl;

    @GetMapping("/demo")
    public List<Exam> getAllEmployees() {
        return examDaoImpl.getAll();
    }
}
