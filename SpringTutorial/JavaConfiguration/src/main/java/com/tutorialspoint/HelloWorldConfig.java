package com.tutorialspoint;
import org.springframework.context.annotation.*;

/**
 * Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container
 * as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return
 * an object that should be registered as a bean in the Spring application context.
 * The simplest possible @Configuration class would be as follows −
 */

@Configuration
public class HelloWorldConfig {

    // The code below will be equivalent to the following XML configuration
    // <beans>
    //   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
    //</beans>

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }


    public static void main(String[] args) {
        // using configuration class
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//        helloWorld.setMessage("Hello World!");
//        helloWorld.getMessage();


        // with multiple configuration classes
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//
//        ctx.register(AppConfig.class, OtherConfig.class);
//        ctx.register(AdditionalConfig.class);
//        ctx.refresh();
//
//        MyService myService = ctx.getBean(MyService.class);
//        myService.doStuff();
    }
}