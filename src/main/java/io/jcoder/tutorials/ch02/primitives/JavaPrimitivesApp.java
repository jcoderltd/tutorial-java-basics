/*
 * Copyright 2017 the original author or authors.
 */
package io.jcoder.tutorials.ch02.primitives;

/**
 * Example class used in the Primitives section of the Java 8 for Beginners Course.
 * 
 * <p>https://jcoder.io/content/course/java/beginners/ch02/primitives</p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaPrimitivesApp {

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        long aBigNumber = 12345678900L;

        float f = 1.2F;
        double d = 2.4D;

        boolean bool1 = true;
        boolean anotherBool = false;

        char c = 'a';

        String text = "Example text";

        System.out.println("The values of the variables are: ");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("another long: " + aBigNumber);

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("boolean: " + bool1);
        System.out.println("another boolean: " + anotherBool);

        System.out.println("char: " + c);

        System.out.println("String: " + text);
    }

}
