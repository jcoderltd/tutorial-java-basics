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
public class TryReturnApp {

    public static void main(String[] args) {
        IntegerDivider divider = new IntegerDivider();

        // the divisor is not 0, so no exception is thrown
        System.out.println("The result is: " + divider.divide(100, 25));

        // the divisor is 0, so an ArithmeticException is thrown and caught
        System.out.println("The result is: " + divider.divide(100, 0));
    }

}
