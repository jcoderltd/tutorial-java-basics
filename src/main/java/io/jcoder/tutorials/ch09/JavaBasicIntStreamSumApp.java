/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch09;

import java.util.stream.IntStream;

/**
 * Example class used in the Stream section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch09/streamterminal
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicIntStreamSumApp {
    
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        Integer sum = IntStream.of(array).sum();

        System.out.println("The sum is: " + sum);
    }
    
}
