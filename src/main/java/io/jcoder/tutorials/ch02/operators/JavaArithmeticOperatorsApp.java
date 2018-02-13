/*
 * Copyright 2017 - JCoder Ltd
 */
package io.jcoder.tutorials.ch02.operators;

/**
 * Example class used in the Arithmetics Operators section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch02/arithmeticoperators
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaArithmeticOperatorsApp {

    public static void main(String[] args) {
        int cores = 4;
        int memoryInGB = 256;

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

        // String concatenation
        String start = "This is a ";
        String end = "sentence";
        System.out.println(start + end);
    }
}
