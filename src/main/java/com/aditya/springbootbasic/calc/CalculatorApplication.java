package com.aditya.springbootbasic.calc;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(CalculatorApplication.class, args);
		
		//better not to retrieve beans manually. Use DI instead.
		/*
		var calculator= ctx.getBean(Calculator.class);
		calculator.calculate(10, 20, "+");
		calculator.calculate(10, 23, "*");
		calculator.calculate(78, 44, "+");
		calculator.calculate(1, 0, "*");
		*/
	}
	
//	@Bean
//	Calculator calculator(List<Operation> operations) {
//		return new Calculator(operations);
//	}
	
	@Bean
	ApplicationRunner calculationRunner(Calculator calculator) {
		
		return args -> {
			
			calculator.calculate(10, 20, "+");
			calculator.calculate(10, 23, "*");
			calculator.calculate(78, 44, "+");
			calculator.calculate(1, 0, "*");
		};
	}
}






