package com.example.example.controller;

import com.example.example.dao.ExamDao;
import com.example.example.dao.ExamDaoImpl;
import com.example.example.model.Exam;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2")
@RequiredArgsConstructor
public class ExamController {

    @NonNull
    private ExamDaoImpl examDao;

    @GetMapping("/demo")
    public List<Exam> getAllEmployees() {
        try {
            return examDao.getAll();
        }
        catch (Exception e)
        {
            System.out.println(e);
            return examDao.getAll();
        }
    }
}
