package com.aditya.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) {
	
//	try(var ctx = SpringApplication.run(DemoApplication.class, args)){
//	    
//	    System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
//	    var beanNames = ctx.getBeanDefinitionNames();
//	    
//	    Arrays.sort(beanNames);
//	    Arrays.asList(beanNames).forEach(System.out::println);
//	}
	
	SpringApplication.run(DemoApplication.class, args);
	
	
    }

//    @Bean
//    String sayHello() {
//        return "Hello World!";
//    }
}
