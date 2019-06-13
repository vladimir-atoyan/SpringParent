package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppStudent1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student1 student = (Student1) context.getBean("student1");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}