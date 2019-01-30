/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.methodsandfields;

/**
 * Example classed used to show methods and fields when inheritance is involved.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/inheritancemethodsandfields
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Toy {
    private String name;

    // From what age can children use this toy
    int fromAge;

    public Toy(String name, int fromAge) {
        this.name = name;
        this.fromAge = fromAge;
    }

    public void printDescription() {
        System.out.println("*** Toy class ***");
        System.out.println("Toy: " + name + " can be used from age: " + fromAge);
    }

    public void printFromAgeDetails() {
        System.out.println("The minimum age for this toy is: " + fromAge + " years");
    }
}
