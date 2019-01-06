/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch02.operators;

/**
 * Example class used in the Conditional Operators section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch02/conditionaloperators
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaConditionalOperatorsApp {

    public static void main(String[] args) {
        int age = 18;
        int heightInCm = 170;
        
        // check if the age is 18 or over
        boolean ageCheck = (age >= 18);
        
        // check if the height is over 160cm
        boolean heightCheck = (heightInCm > 160);
        
        // Conditional AND (&&)
        
        // check if someone is 18 or over and their height is over 160cm
        boolean check1 = (ageCheck && heightCheck);
        System.out.println("a) 18 or over AND over 160cm? " + check1);
        
        // alternatively, we could write the check in a single line (parenthesis used for clarity)
        // for example:
        // check if someone is 20 or over and their height is over 160cm
        boolean check2 = (age >= 20) && (heightInCm > 160);
        System.out.println("b) 20 or over AND over 160cm? " + check2);
        
        // Conditional OR (||)
        
        // check if someone is 18 or over or 190 or over in height
        boolean check3 = (age >= 18) || (heightInCm >= 190);
        System.out.println("c) 18 or over OR 190cm or over? " + check3);
        
        // check if someone is 20 or over or 190 or over in height
        boolean check4 = (age >= 20) || (heightInCm >= 190);
        System.out.println("d) 20 or over OR 190cm or over? " + check4);
        
        // Ternary Operator (?:)
        
        // give discount of 50% if the age is less than 18
        double discount = (age < 18) ? 0.5d : 0.0d;
        System.out.println("e) discount: " + discount);
    }
}
