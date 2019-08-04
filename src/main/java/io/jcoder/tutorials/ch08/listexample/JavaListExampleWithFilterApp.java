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
public class JavaListExampleWithFilterApp {
    public static void main(String[] args) {
        // our input list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 11, 12, 0);

        // get the filter we want to use
        Filter<Integer> filterToUse = new GreaterThanFiveFilter();

        // call our new `filterNumbers` static method to do the filtering
        List<Integer> filtered = filterNumbers(numbers, filterToUse);

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
}
