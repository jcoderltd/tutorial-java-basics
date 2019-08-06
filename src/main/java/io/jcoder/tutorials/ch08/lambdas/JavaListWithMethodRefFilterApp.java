/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch08.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.jcoder.tutorials.ch08.listexample.Filter;

/**
 * Example class used to help introduce lambdas.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch08/lambdas
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaListWithMethodRefFilterApp {

    public static void main(String[] args) {
        // our input list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 11, 12, 0);

        // call our new `filterNumbers` static method to do the filtering
        List<Integer> filtered = filterNumbers(numbers, JavaListWithMethodRefFilterApp::greaterThanFive);

        // print out the filtered list
        for (Integer number : filtered) {
            System.out.println(number);
        }
    }

    private static List<Integer> filterNumbers(List<Integer> numbers, Filter<Integer> filterToUse) {
        List<Integer> filtered = new ArrayList<>();
        // filter the list using the provided `filterToUse`
        for (Integer number : numbers) {
            if (filterToUse.filter(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }

    private static boolean greaterThanFive(Integer element) {
        return element > 5;
    }
}
