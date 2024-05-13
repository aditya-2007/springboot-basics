package com.aditya.springbootbasic.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
	
	private final Multiplication multiplication = new Multiplication();
	
	@Test
	public void shouldMatchSign() {
		
		assertTrue(multiplication.handles("*"));
		assertFalse(multiplication.handles("/"));
	}
	
	@Test
	public void shouldCalculateCorrectly() {
		
		assertEquals(150, multiplication.apply(10, 15));
		assertEquals(10, multiplication.apply(10, 1));
	}
}
