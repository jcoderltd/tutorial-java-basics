/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch09;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example class used in the Stream section.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch09/streamcreation
 * https://jcoder.io/content/course/java/beginners/ch09/streamterminal
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicIntegerStreamApp {

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 4, 5 };
        List<Integer> result = Stream.of(array)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        for (int number : result) {
            System.out.println(number);
        }
    }

}
