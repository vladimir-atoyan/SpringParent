package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        BankName bn = BankName.fromString("ibt");
        bn = BankName.fromString("UNKNOWN");
        bn = BankName.fromString("xx");
        bn = BankName.fromString(null);


        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

        HelloIndia objC = (HelloIndia) context.getBean("helloIndia1");
        objC.getMessage1();
        objC.getMessage2();
        objC.getMessage3();

        HelloIndia objD = (HelloIndia) context.getBean("helloIndia2");
        objD.getMessage1();
        objD.getMessage2();
        objD.getMessage3();

        HelloIndia objT = (HelloIndia) context.getBean("beanTeamplate2");
        objT.getMessage1();
    }





}