package com.aditya.springbootbasic.calc;

import org.springframework.stereotype.Component;

@Component
public class Multiplication implements Operation {

  @Override
  public int apply(int lhs, int rhs) {
    return lhs * rhs;
  }

  @Override
  public boolean handles(String op) {
    return "*".equals(op);
  }

}
