/*
 * Copyright 2017 - JCoder Ltd
 */
package io.jcoder.tutorials.ch02.operators;

/**
 * Example class used in the Unary Operators section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch02/operators
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaUnaryOperatorsApp {

    public static void main(String[] args) {
        // + and - as unary operators
        int result1 = +1;
        // result1 is 1
        System.out.println("result1 = " + result1);
        
        int result2 = -result1;
        // result2 is -1
        System.out.println("result2 = " + result2);
        
        // prefix increment operator
        int value1 = 0;
        int result3 = ++value1;
        // result3 is 1 and value1 is also 1
        System.out.println("result3 = " + result3);
        System.out.println("value1 = " + value1);
        
        // postfix increment operator
        int value2 = 0;
        int result4 = value2++;
        // result4 is 0 and value2 is 1
        System.out.println("result4 = " + result4);
        System.out.println("value2 = " + value2);
        
        // logical complement operator
        boolean value3 = true;
        boolean result5 = !value3;
        System.out.println("value3 = " + value3);
        System.out.println("result5 = " + result5);
        
    }
}
