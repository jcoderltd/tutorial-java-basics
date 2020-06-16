/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch11.multiplecatch;

/**
 * Example class used in the Try-Catch-Finally section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch11/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */

import java.util.ArrayList;
import java.util.List;

public class MultipleCatchApp {

    public static void main(String[] args) {

        System.out.println("Multiple catch blocks: \n");

        List<Integer> list = new ArrayList<>();
        list.add(36);
        list.add(4);
        list.add(0);

        try {
            int result = list.get(0) / list.get(1); // 36/4
            System.out.println("The result is: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An IndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getClass());
        }

        try {
            int result = list.get(0) / list.get(5); // Index 5 is out of bounds
            System.out.println("The result is: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An IndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getClass());
        }

        try {
            int result = list.get(0) / list.get(2); // 36/0
            System.out.println("The result is: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An IndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getClass());
        }

        list = null;
        try {
            int result = list.get(0) / list.get(1); // list is null
            System.out.println("The result is: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An IndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getClass());
        }

        System.out.println("\nMultiple exception types in a single catch block: \n");

        list = new ArrayList<>();
        list.add(36);
        list.add(4);
        list.add(0);

        try {
            int result = list.get(0) / list.get(5); // Index 5 is out of bounds
            System.out.println("The result is: " + result);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("An IndexOutOfBoundsException or ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getClass());
        }

        try {
            int result = list.get(0) / list.get(2); // 36/0
            System.out.println("The result is: " + result);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("An IndexOutOfBoundsException or ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception occurred: " + e.getClass());
        }

    }

}
