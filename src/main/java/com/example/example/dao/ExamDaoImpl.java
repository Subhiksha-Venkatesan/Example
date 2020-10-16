package com.example.example.dao;

import com.example.example.model.Exam;
import com.example.example.repository.ExamRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Component
public class ExamDaoImpl implements ExamDao {

    @NonNull
    private ExamRepository examRepository;

    @Override
    public List <Exam> getAll() {
        return examRepository.findAll();
    }
}




