package com.tutorialspoint;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

class Foo1 {
}

@Configuration
class AppConfig1 {
    @Bean
    @Scope("prototype")
    public Foo1 foo() {
        return new Foo1();
    }
}

/**
 * Specifying Bean Scope
 */
public class MainApp4 {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig1.class);
        Foo1 foo1 = ctx.getBean(Foo1.class);
        Foo1 foo2 = ctx.getBean(Foo1.class);
        System.out.println("Foo1: " + foo1);
        System.out.println("Foo2: " + foo2
        );
    }
}