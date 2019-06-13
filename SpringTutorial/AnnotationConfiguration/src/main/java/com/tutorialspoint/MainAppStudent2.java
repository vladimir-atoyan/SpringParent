package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppStudent2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Profile2 profile = (Profile2) context.getBean("profile2");
        profile.printAge();
        profile.printName();
    }
}