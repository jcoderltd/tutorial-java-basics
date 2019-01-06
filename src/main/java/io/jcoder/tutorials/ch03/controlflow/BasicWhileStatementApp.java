/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Basic example used in the While Statements section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch03/whilestatement
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BasicWhileStatementApp {

    public static void main(String[] args) {
        // example of a while statement that performs the sum of numbers from 1 to n (1 + 2 + 3 + ... + n)

        int n = 3;
        int sum = 0;
        int count = 1;
        while (count <= n) {
            sum = sum + count;
            count++;
        }

        System.out.println("The sum from 1 to " + n + " is: " + sum);

        // example of a do-while statement that calculates the factorial of a number m (1 * 2 * 3 * ... * m)

        int m = 4;
        int factorial = 1;
        int current = 1;
        do {
            factorial = factorial * current;
            current++;
        } while (current <= m);

        System.out.println("The factorial of " + m + " is: " + factorial);
    }

}
