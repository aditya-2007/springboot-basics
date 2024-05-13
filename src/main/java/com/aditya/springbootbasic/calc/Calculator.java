package com.aditya.springbootbasic.calc;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * A 'integer only' calculator for spring boot testing purpose
 * 
 * @author Aditya.Bhogale
 *
 */
@Component
public class Calculator {

  private final List<Operation> operations;

  public Calculator(List<Operation> operations) {
    this.operations = operations;
  }
  
  public Collection<Operation> getOperations() {
	return operations;
  }

  public void calculate(int lhs, int rhs, String op) {
    operations.stream().filter((operation) -> operation.handles(op))
        .map((operation) -> operation.apply(lhs, rhs))
        .peek((result) -> System.out.printf("%d %s %d = %s%n", lhs, op, rhs, result))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Unknown Operation: " + op));
  }
}
