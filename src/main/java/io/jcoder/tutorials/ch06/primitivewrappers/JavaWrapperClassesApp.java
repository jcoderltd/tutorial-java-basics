/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.primitivewrappers;

/**
 * Example class used to explain wrapper classes in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/primitivewrappers
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaWrapperClassesApp {
    public static void main(String[] args) {
        // autoboxing when invoking a method
        int numberToPrint = 10;
        ObjectPrinter printer = new ObjectPrinter();
        printer.printObject(numberToPrint);
        
        // useful static helper methods
        int value = Integer.parseInt("-10");
        System.out.println(value);
        
        // use in generic classes
        Gift<Integer> monetaryGift = new Gift<>(10, "Jane", "John");
        System.out.println("The gift is: " + monetaryGift);
    }
}
