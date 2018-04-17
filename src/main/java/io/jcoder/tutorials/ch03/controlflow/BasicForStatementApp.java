/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Basic example used in the For Statement section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/forstatement
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BasicForStatementApp {

    public static void main(String[] args) {
        // example of a for statement that performs the sum of numbers from 1 to n (1 + 2 + 3 + ... + n)

        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum from 1 to " + n + " is: " + sum);
    }

}
