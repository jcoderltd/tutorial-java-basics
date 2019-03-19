/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.generics;

/**
 * Example class used to introduce generics.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/genericclasses
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public void printDescription() {
        System.out.println("Toy: " + name);
    }
}
