/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch11.throwandthrows;

/**
 * Example class used in the Try-Catch-Finally section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch11/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class PositiveIntegerDivider {
    
    int divide(int dividend, int divisor) {
        try {
            System.out.println("Try block executed");
            if (dividend < 0 && divisor <= 0) {
                throw new IllegalArgumentException("dividend is not greater or equal than 0 and divisor is not greater than 0");
            } else if (dividend < 0) {
                throw new IllegalArgumentException("dividend is not greater or equal than 0");
            } else if (divisor <= 0) {
                throw new IllegalArgumentException("divisor is not greater than 0");
            }
            return dividend/divisor;
        } catch(IllegalArgumentException e) {
            System.out.println("Catch block executed");
            System.out.println("An IllegalArgumentException occurred: " + e.getMessage());
            return -1;
        }
    }

}
