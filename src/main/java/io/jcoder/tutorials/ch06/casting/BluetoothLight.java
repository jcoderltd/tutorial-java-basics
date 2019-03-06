/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.casting;

/**
 * Example class used to explain the instanceof (type comparison) operator and object casting
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/casting
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

    public void connectBluetooth(String bluetoothDevice, int pinCode) {
        System.out.println("Connecting to Bluetooth device " + bluetoothDevice + " with pin: " + pinCode);
    }

}
