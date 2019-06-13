package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Built-in Events & Description
 *
 * 1 ContextRefreshedEvent
 * This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised
 * using the refresh() method on the ConfigurableApplicationContext interface.
 *
 * 2 ContextStartedEvent
 * This event is published when the ApplicationContext is started using the start() method on the
 * ConfigurableApplicationContext interface. You can poll your database or you can restart
 * any stopped application after receiving this event.
 *
 * 3 ContextStoppedEvent
 * This event is published when the ApplicationContext is stopped using the stop() method on the
 * ConfigurableApplicationContext interface. You can do required housekeep work after receiving this event.
 *
 *  4 ContextClosedEvent
 * This event is published when the ApplicationContext is closed using the close() method on the
 * ConfigurableApplicationContext interface. A closed context reaches its end of life;
 * it cannot be refreshed or restarted.
 *
 * 5 RequestHandledEvent
 * This is a web-specific event telling all beans that an HTTP request has been serviced.
 */

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }
}