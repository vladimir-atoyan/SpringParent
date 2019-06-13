package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Using Spring ApplicationContext Container
 */
public class MainApp2 {
    public static void main(String[] args) {

        // nee to provide full path
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "D:\\java\\Spring\\HelloSpring1\\src\\main\\resources\\Beans.xml");
        //        "C:/Users/ZARA/workspace/HelloSpring/src/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}