package com.application;

import com.application.config.RootConfiguration;
import com.application.util.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Application application = ac.getBean("application", Application.class);
        application.run();
    }
}
