/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch09;

import java.util.stream.Stream;

/**
 * Example class used in the Stream section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch09/streamterminal
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicStreamReduceApp {

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3 };
        Integer sum = Stream.of(array)
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println("The sum is: " + sum);
    }

}
