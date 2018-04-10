/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch02.operators;

/**
 * Example class used in the Equality and Relational Operators section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch02/relationaloperators
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaRelationalOperatorsApp {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 1;

        boolean areDifferent = (a != b);
        System.out.println("a and b are different? " + areDifferent);
        
        boolean areEqual = (a == b);
        System.out.println("a and b are equal? " + areEqual);
        
        // used to illustrate the behaviour of the == operator in object references
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("x and y point to the same object? " + (x == y));
        
        boolean lessThan = (a < b);
        System.out.println("a is less than b? " + lessThan);
        
        boolean lessOrEqual = (a <= c);
        System.out.println("a is less than or equal to c? " + lessOrEqual);
        
        boolean greaterThan = (a > b);
        System.out.println("a is greater than b? " + greaterThan);
        
        boolean greaterOrEqual = (a >= b);
        System.out.println("a is greater than or equal to b? " + greaterOrEqual);
    }
}
