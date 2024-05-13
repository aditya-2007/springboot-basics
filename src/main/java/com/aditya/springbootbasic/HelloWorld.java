package com.aditya.springbootbasic;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class HelloWorld {
    
    @PostConstruct
    public void sayHello() {
	System.out.println("Hello World!");
    }
}
