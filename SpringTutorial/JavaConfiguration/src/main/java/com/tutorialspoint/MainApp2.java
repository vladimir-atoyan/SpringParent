package com.tutorialspoint;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.*;

class A {
}

class B {
}

@Configuration
class ConfigA {
    @Bean
    public A a() {
        return new A();
    }
}

@Configuration
@Import(ConfigA.class)
class ConfigB {
    @Bean
    public B b() {
        return new B();
    }
}

/**
 * The @Import Annotation
 */
public class MainApp2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);
    }
}