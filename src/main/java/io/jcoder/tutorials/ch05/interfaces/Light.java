/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.interfaces;

/**
 * Example interface used in the interfaces section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/interfaces
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public interface Light {

    void turnOn();

    void turnOff();

    default void testLight() {
        System.out.println("Testing the light:");
        turnOn();
        turnOff();
    }
}
