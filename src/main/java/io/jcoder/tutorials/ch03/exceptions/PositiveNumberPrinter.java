/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.exceptions;

/**
 * Example class used in the Exceptions section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch03/exceptions
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class PositiveNumberPrinter {

    /**
     * Prints the given number only if it is positive. Otherwise, an IllegalArgumentException is thrown.
     * 
     * @param number
     *            The number to print out.
     */
    public void printNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must be positive, got: " + number);
        }

        System.out.println("The number is: " + number);
    }

}
