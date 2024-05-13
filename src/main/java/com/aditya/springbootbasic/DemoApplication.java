package com.aditya.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) {


		// Recipe 1
//		try (var ctx = SpringApplication.run(DemoApplication.class, args)) {
//
//			System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
//			var beanNames = ctx.getBeanDefinitionNames();
//
//			Arrays.sort(beanNames);
//			Arrays.asList(beanNames).forEach(System.out::println);
//		}
	
    //calculator app
    	
	SpringApplication.run(DemoApplication.class, args);
	
	
    }

}
