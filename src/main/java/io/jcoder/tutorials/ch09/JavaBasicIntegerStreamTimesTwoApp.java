/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch09;

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
public class JavaBasicIntegerStreamTimesTwoApp {

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 4, 5 };
        Stream.of(array)
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }

}
