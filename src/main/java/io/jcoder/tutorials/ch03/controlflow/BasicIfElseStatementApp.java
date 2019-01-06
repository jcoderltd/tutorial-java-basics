/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Basic example used in the If-Else Statement section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch03/ifelsestatement
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BasicIfElseStatementApp {

    public static void main(String[] args) {
        int age = 19;
        double discount = 1d;

        if (age < 18) {
            discount = 0.5d;
            System.out.println("The age is under 18");
        } else {
            discount = 0d;
            System.out.println("The age is 18 or over");
        }

        System.out.println("The discount to use is: " + discount);
    }

}
