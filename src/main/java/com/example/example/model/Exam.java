package com.example.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "table1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Exam {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name=" + name +"]";
    }
}
