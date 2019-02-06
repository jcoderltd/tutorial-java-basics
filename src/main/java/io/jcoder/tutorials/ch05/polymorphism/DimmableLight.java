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
public class DimmableLight extends Light {

    private int power;

    public DimmableLight(int power) {
        this.power = power;
    }

    @Override
    public void turnOn() {
        System.out.println("Turned on the dimmable light and setting power to: " + power);
    }

    @Override
    public void turnOff() {
        System.out.println("Turned off the dimmable light");
    }

    public void setPower(int power) {
        this.power = power;
    }

}
