package com.example.example.dao;

import com.example.example.model.Exam;
import com.example.example.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExamDaoImpl implements ExamDao {

    @Autowired
    private ExamRepository examRepository;

    /* @Override
    public void create() {

    } */

    @Override
    public List <Exam> getAll() {
        return examRepository.findAll();
    }
}
