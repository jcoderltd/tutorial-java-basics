/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.constructors;

/**
 * Example classed used to show constructors when inheritance is involved.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/inheritanceandconstructors
 * </p>
 *   
 * @author Camilo Gonzalez
 */
public class DimmableLight extends Light {
    private int power;

    public DimmableLight() {
        this(false, 0);
    }

    public DimmableLight(boolean isLigthOn, int initialPower) {
        super(isLigthOn);
        System.out.println("DimmableLight constructor");
        setPower(initialPower);
    }

    public void setPower(int newPower) {
        if (newPower < 0 || newPower > 100) {
            System.out.println("Invalid new power provided, expected 0-100 but got: " + newPower);
        }

        if (newPower == 0) {
            turnOff();
        } else {
            turnOn();
        }

        power = newPower;
    }

    public int getPower() {
        return power;
    }

    public void printDimmableLightDetails() {
        System.out.println("The dimmable light is on? " + on);
        if (on) {
            System.out.println("The dimmable light power is: " + power);
        }
    }
}
