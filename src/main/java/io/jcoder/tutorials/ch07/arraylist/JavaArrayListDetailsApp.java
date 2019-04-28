/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.arraylist;

import java.util.ArrayList;

/**
 * Example class used to explain ArrayList in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/arraylist
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaArrayListDetailsApp {
    public static void main(String[] args) {
        // creates an ArrayList with an initial capacity enough to store 4 elements
        ArrayList<Integer> numbers = new ArrayList<>(4);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Size of the list: " + numbers.size());

        numbers.add(40);

        numbers.add(50);
    }
}
