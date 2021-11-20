package com.application.config;

import com.application.service.CalcService;
import com.application.util.Application;
import com.application.util.ConsoleReader;
import com.application.util.ConsoleWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class RootConfiguration {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    @Bean
    public CalcService calculator(){
        return new CalcService();
    }

    @Bean
    public ConsoleReader consoleReader(@Qualifier("scanner") Scanner scanner){
        return new ConsoleReader(scanner);
    }

    @Bean
    public ConsoleWriter consoleWriter(){
        return new ConsoleWriter();
    }

    @Bean
    public Application application(@Qualifier("calculator") CalcService calculator,
                                   @Qualifier("consoleReader") ConsoleReader consoleReader,
                                   @Qualifier("consoleWriter") ConsoleWriter consoleWriter){
        return new Application(calculator, consoleReader, consoleWriter);
    }
}
