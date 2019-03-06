/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.casting;

/**
 * Example interface used to explain the instanceof (type comparison) operator and object casting
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/casting
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class WiFiLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("Turning on the light via WiFi");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light via WiFi");
    }

    public void connectWifi(String wifiNetworkName, String password) {
        System.out.println("Connecting to WiFi: " + wifiNetworkName + " with password: " + password);
    }
}
