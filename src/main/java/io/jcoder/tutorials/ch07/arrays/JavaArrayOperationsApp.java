/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.arrays;

import java.util.Arrays;

/**
 * Example class used to explain arrays in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/arrayops
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaArrayOperationsApp {
    public static void main(String[] args) {
        String[] words = { "An", "example", "sentence" };
        // iterating with a normal for loop
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word: " + words[i]);
        }

        // iterating with an enhanced-for loop
        for (String word : words) {
            System.out.println("Word: " + word);
        }
        
        // example of sorting of elements
        int[] numbers = { 9, 5, 1 };
        Arrays.sort(numbers);
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
