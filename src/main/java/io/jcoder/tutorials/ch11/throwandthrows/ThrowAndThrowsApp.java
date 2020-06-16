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
public class ThrowAndThrowsApp {

    public static void main(String[] args) {
        PositiveIntegerDivider divider = new PositiveIntegerDivider();

        // the divisor and the dividend are both negative, so an IllegalArgumentException is thrown
        System.out.println("The result is: " + divider.divide(-50, -10));

        // the dividend is negative, so an IllegalArgumentException is thrown
        System.out.println("The result is: " + divider.divide(-50, 10));

        // the divisor is negative, so an IllegalArgumentException is thrown
        System.out.println("The result is: " + divider.divide(50, -10));

        // the divisor and the dividend are both positive, so no exception is thrown
        System.out.println("The result is: " + divider.divide(50, 10));
    }

}
