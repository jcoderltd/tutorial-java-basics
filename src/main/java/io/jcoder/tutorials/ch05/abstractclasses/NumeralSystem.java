/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.abstractclasses;

/**
 * Example class used to introduce abstract classes in the beginners Java course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/abstract
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public abstract class NumeralSystem {

    public abstract String convert(int number);

    public void print(int number) {
        String convertedNumber = convert(number);
        System.out.println(convertedNumber);
    }

}
