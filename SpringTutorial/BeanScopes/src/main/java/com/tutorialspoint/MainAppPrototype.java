package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppPrototype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorldPrototype");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorldPrototype");
        objB.getMessage();
    }
}