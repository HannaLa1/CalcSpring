package com.application;

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
    public Operation operation(){
        return new Operation();
    }

    @Bean
    public CalcService calculator(){
        return new CalcService();
    }

    @Bean
    public ExpInput expInput( @Qualifier("scanner") Scanner scanner){
        return new ExpInput(scanner);
    }

    @Bean
    public Application application(@Qualifier("calculator") CalcService calculator,
                                   @Qualifier("operation") Operation operation, @Qualifier("expInput") ExpInput expInput){
        return new Application(calculator, operation, expInput);
    }
}
