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
public class BinaryNumeralSystem extends NumeralSystem {
    @Override
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
