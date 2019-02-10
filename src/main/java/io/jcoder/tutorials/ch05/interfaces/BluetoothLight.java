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
public class BluetoothLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("Turning on the light via Bluetooth");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light via Bluetooth");
    }

}
