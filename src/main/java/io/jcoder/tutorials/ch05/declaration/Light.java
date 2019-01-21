/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.declaration;

/**
 * Example classed used to show different access level modifiers in Java.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/declaration1
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Light {
    private boolean isOn;

    private String color;

    private int power = 0;

    public Light() {
        this(false, "WHITE");
    }

    public Light(boolean isLightOn, String lightInitialColor) {
        isOn = isLightOn;
        color = lightInitialColor;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOn(String withColor) {
        color = withColor;
        isOn = true;
    }

    public void turnOn(int withPower) {
        isOn = true;
        power = withPower;
    }

    public void turnOn(String withColor, int withPower) {
        color = withColor;
        power = withPower;
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setPower(int newPower) {
        if (newPower >= 0 || newPower <= 100) {
            power = newPower;
        } else {
            System.out.println("Invalid power value provided: " + newPower);
        }
    }

    public boolean isTurnedOn() {
        return isOn;
    }

    public void printLightDetails() {
        String isLightOnMessage;
        if (isOn) {
            isLightOnMessage = "turned on";
        } else {
            isLightOnMessage = "turned off";
        }
        System.out.println("The light is " + isLightOnMessage + " with color: " + color + " and power set to: " + power + "%");
    }
}
