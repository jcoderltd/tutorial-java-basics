/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch11.tryreturn;

/**
 * Example class used in the Try-Catch-Finally section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch11/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class IntegerDivider {

	int divide(int dividend, int divisor){
        try{
            System.out.println("Try block executed");
            return dividend/divisor;
        } catch(ArithmeticException e) {
            System.out.println("Catch block executed");
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
            return -1;
        } finally {
            System.out.println("Finally block executed");
            // return statement that overrides returns in try and catch
            return 0;
        }
    }
	
}
