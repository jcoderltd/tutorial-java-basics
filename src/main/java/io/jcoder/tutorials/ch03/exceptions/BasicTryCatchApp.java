/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.exceptions;

/**
 * Example class used in the Exceptions section.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/exceptions
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BasicTryCatchApp {

    public static void main(String[] args) {
        PositiveNumberPrinter printer = new PositiveNumberPrinter();

        try {
            // no exception thrown
            printer.printNumber(1);

            // this throws an IllegalArgumentException
            printer.printNumber(-1);

            // this line isn't reached due to the exception
            printer.printNumber(2);
        } catch (IllegalArgumentException ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
        }

        // as the exception above was handled, this line is executed normally
        printer.printNumber(3);
    }

}
