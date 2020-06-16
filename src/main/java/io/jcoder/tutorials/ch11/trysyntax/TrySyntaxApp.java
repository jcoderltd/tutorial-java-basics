/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch11.trysyntax;

/**
 * Example class used in the Try-Catch-Finally section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch11/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class TrySyntaxApp {

    public static void main(String[] args) {

        // No exception occurs
        try {
            System.out.println("Try block executed");
            int x = 12 / 4;
        } catch (ArithmeticException e) {
            System.out.println("Catch block executed");
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("After try/catch/finally block. \n");

        // An exception occurs and is handled
        try {
            System.out.println("Try block executed");
            int x = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch block executed");
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("After try/catch/finally block. \n");

        // An exception occurs and is not handled
        try {
            System.out.println("Try block executed");
            int x = 12 / 0;
        } catch (NullPointerException e) {
            System.out.println("Catch block executed");
            System.out.println("An NullPointerException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("After try/catch/finally block. \n");
    }

}
