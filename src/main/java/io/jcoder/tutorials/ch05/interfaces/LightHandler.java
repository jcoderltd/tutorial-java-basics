/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.interfaces;

/**
 * Example class used to introduce the concept of interfaces.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/interfaces
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
