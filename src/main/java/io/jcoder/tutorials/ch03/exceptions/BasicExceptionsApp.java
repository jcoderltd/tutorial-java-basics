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
public class BasicExceptionsApp {

    public static void main(String[] args) {
        PositiveNumberPrinter printer = new PositiveNumberPrinter();

        // the number is positive, so the method doesn't throw an exception
        printer.printNumber(20);

        // the number is negative, an exception is thrown
        printer.printNumber(-1);

        // due to the exception, the main method stops executing and this line
        // isn't reached by the program
        printer.printNumber(5);
    }

}
