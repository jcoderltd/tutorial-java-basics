/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch08.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.jcoder.tutorials.ch08.listexample.Filter;

/**
 * Example class used to help introduce anonymous classes.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch08/anonymous
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaListWithAnonymousFilterAndLocalVarApp {
    
    public static void main(String[] args) {
        // our input list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 11, 12, 0);
        
        final int minimum = 10;
        
        // get the filter we want to use as an anonymous class
        Filter<Integer> filterToUse = new Filter<Integer>() {
            @Override
            public boolean filter(Integer element) {
                if (element > minimum) {
                    return true;
                }
                return false;
            }
        };

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
