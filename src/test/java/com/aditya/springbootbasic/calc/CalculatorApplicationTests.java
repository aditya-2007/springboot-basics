package com.aditya.springbootbasic.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CalculatorApplication.class)
public class CalculatorApplicationTests {
	
	@Autowired
	Calculator calculator;

	@Test
	public void performingDivisionShouldFail() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> calculator.calculate(4, 2, "/"));
	}
}






