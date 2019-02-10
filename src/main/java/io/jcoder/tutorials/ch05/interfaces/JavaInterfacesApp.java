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
public class JavaInterfacesApp {

    public static void main(String[] args) {
        Light light1 = new WiFiLight();
        Light light2 = new BluetoothLight();
        
        LightHandler lightHandler = new LightHandler();
        lightHandler.turnOn(light1);
        lightHandler.turnOff(light2);
        
        light1.testLight();
    }

}
