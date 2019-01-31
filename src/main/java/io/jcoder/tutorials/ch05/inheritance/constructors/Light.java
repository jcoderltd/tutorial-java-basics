/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.constructors;

/**
 * Example class used to show constructors when inheritance is involved.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/inheritanceandconstructors
 * </p>
 *  
 * @author Camilo Gonzalez
 */
public class Light {
    protected boolean on;

    public Light(boolean isLigthOn) {
        System.out.println("Light constructor");
        on = isLigthOn;
    }

    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    public void printLightDetails() {
        System.out.println("The light is on? " + on);
    }
}
