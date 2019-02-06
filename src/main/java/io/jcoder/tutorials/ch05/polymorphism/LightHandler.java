/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.polymorphism;

/**
 * Example class used to introduce the concept of polymorphism.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/polymorphism
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class LightHandler {

    public void turnOn(Light light) {
        light.turnOn();
    }

    public void turnOff(Light light) {
        light.turnOff();
    }

}
