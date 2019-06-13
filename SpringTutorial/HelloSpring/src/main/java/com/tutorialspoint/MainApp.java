package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileSystemXmlApplicationContext − This container loads the definitions of the beans from an XML file.
 * Here you need to provide the full path of the XML bean configuration file to the constructor.
 * (See the MainApp2)
 * <p>
 * ClassPathXmlApplicationContext − This container loads the definitions of the beans from an XML file.
 * Here you do not need to provide the full path of the XML file but you need to set CLASSPATH properly
 * because this container will look like bean configuration XML file in CLASSPATH.
 * <p>
 * WebXmlApplicationContext − This container loads the XML file with definitions of all beans from within a web application.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}