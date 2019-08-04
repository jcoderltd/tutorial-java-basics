/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch08.listexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example class used to help introduce lambdas and anonymous classes in other sections of this chapter.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch08/listexample
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaListExampleApp {
    public static void main(String[] args) {
        // our input list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 11, 12, 0);

        // we'll store our filtered results in this list
        List<Integer> filtered = new ArrayList<>();

        // filter the list and allow only numbers that are less than 10
        for (Integer number : numbers) {
            if (number < 10) {
                filtered.add(number);
            }
        }

        // print out the filtered list
        for (Integer number : filtered) {
            System.out.println(number);
        }
    }
}
