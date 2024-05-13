package com.aditya.springbootbasic.calc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(CalculatorApplication.class, args);
		var calculator= ctx.getBean(Calculator.class);
		calculator.calculate(10, 20, "+");
		calculator.calculate(10, 23, "*");
		calculator.calculate(78, 44, "+");
		calculator.calculate(1, 0, "*");
	}
	
	@Bean
	Calculator calculator(List<Operation> operations) {
		return new Calculator(operations);
	}
}
