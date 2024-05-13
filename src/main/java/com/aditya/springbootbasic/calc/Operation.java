package com.aditya.springbootbasic.calc;

public interface Operation {
    int apply (int lhs, int rhs);
    boolean handles(String op);
}
