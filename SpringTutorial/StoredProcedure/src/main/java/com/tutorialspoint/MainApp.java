package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tutorialspoint.StudentJDBCTemplate;

/**

 To understand the approach, let us take our Student table which can be created in MySQL TESTDB database
 with the following DDL −

 CREATE TABLE Student(
 ID   INT NOT NULL AUTO_INCREMENT,
 NAME VARCHAR(20) NOT NULL,
 AGE  INT NOT NULL,
 PRIMARY KEY (ID)
 );

 So let us create this stored procedure in your TESTDB database using MySQL command prompt −

 DELIMITER $$
 DROP PROCEDURE IF EXISTS getRecord $$
 CREATE PROCEDURE getRecord (
 IN in_id INTEGER,
 OUT out_name VARCHAR(20),
 OUT out_age  INTEGER)
 BEGIN
 SELECT NAME, age
 INTO out_name, out_age
 FROM Student WHERE id = in_id;
 END $$
 DELIMITER ;

 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }
}