/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch08.listexample;

/**
 * Example filter used to help introduce lambdas and anonymous classes in other sections of this chapter.
 * 
 * <p>
 * This filter checks if a number is greater than 5, and if so it returns true, false otherwise
 * </p>
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch08/listexample
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class GreaterThanFiveFilter implements Filter<Integer> {

    @Override
    public boolean filter(Integer element) {
        if (element > 5) {
            return true;
        }
        return false;
    }

}
