/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Basic example used in the If Statement section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/ifstatement
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BasicIfStatementApp {

    public static void main(String[] args) {
        int age = 17;
        double discount = 0d;

        if (age < 18) {
            discount = 0.5d;
            System.out.println("The age is under 18");
        }

        if (age >= 18) {
            discount = 0d;
            System.out.println("The age is 18 or over");
        }

        System.out.println("The discount to use is: " + discount);
    }

}
