/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.arrays;

/**
 * Example class used to explain arrays in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/arrays
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicArraysApp {
    public static void main(String[] args) {
        String[] anArray = { "This is", "an array", "of Strings", null };
        System.out.println("The length of the array is: " + anArray.length);

        String lastElement = anArray[anArray.length - 1];
        System.out.println("The last element of the array is: " + lastElement);

        // if uncommented, the following line will throw an exception as 10 isn't a valid index
        // anArray[10] = "Index 10 isn't valid";

        int[][] matrix = {
                { 1, 2 },
                { 3, 4 }
        };
        System.out.println("The element in the first row and first column is: " + matrix[0][0]);
    }
}
