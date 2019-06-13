package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Foo {
    public void init() {
        // initialization logic
        System.out.println("Foo initialization logic");
    }
    public void cleanup() {
        // destruction logic
        System.out.println("Foo destruction logic");
    }
}

@Configuration
class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup" )
    public Foo foo() {
        return new Foo();
    }
}

/**
 * Lifecycle Callbacks
 */
public class MainApp3 {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Foo foo = ctx.getBean(Foo.class);
        ctx.registerShutdownHook();
        System.out.println("Foo: " + foo);
    }
}