/*
 * Copyright 2017 - JCoder Ltd
 */
package io.jcoder.tutorials.ch02.operators;

/**
 * Example class used in the Operators section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch02/operators
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaOperatorsApp {

    public static void main(String[] args) {
        // a. assignment operation
        int cores = 4;
        int memoryInGB = 256;
        boolean externalGraphicsCard = true;

        // b. arithmetic operations

        // The + symbol is used for addition
        int result1 = memoryInGB + 256;
        // result1 is 512
        System.out.println(memoryInGB + " + 256 = " + result1);

        // The - symbol is used for subtraction
        int result2 = cores - 3;
        // result2 is 1
        System.out.println(cores + " - 3 = " + result2);

        // The * symbol is used for multiplication
        int result3 = cores * 2;
        // result3 is 8
        System.out.println(cores + " * 2 = " + result3);

        // The / symbol is used for division
        int result4 = cores / 2;
        // result4 is 2
        System.out.println(cores + " / 2 = " + result4);

        // The % symbol is used to get the remainder of a division
        int result5 = cores % 3;
        // result5 is 1
        System.out.println(cores + " % 3 = " + result5);
        
        // c. unary operators
        
        // + and - as unary operators
        int result6 = 1;
        result6 = +1;
        // result6 is 1 using either statement
        
        int result7 = -result6;
        // result7 is -1
        
        // prefix increment operator
        int value1 = 0;
        int result8 = ++value1;
        // result8 is 1 and value1 is also 1
        System.out.println("result8 = " + result8);
        System.out.println("value1 = " + value1);
        
        // postfix increment operator
        int value2 = 0;
        int result9 = value2++;
        // result9 is 0 and value2 is 1
        System.out.println("result9 = " + result9);
        System.out.println("value2 = " + value2);
        
        // logical complement operator
        boolean result10 = !externalGraphicsCard;
        System.out.println("externalGraphicsCard = " + externalGraphicsCard);
        System.out.println("result10 = " + result10);
        
    }
}
