package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile2 {
    @Autowired
    @Qualifier("student2_1")
    private Student2 student;

    public Profile2() {
        System.out.println("Inside Profile2 constructor.");
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {
        System.out.println("Name : " + student.getName());
    }
}