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
public class JavaAbstractClassApp {

    public static void main(String[] args) {
        BinaryNumeralSystem binary = new BinaryNumeralSystem();
        HexadecimalNumeralSystem hexa = new HexadecimalNumeralSystem();

        int number = 15;

        System.out.println(number + " in binary is represented as: ");
        binary.print(number);

        System.out.println(number + " in hexadecimal is represented as: ");
        hexa.print(number);
    }

}
