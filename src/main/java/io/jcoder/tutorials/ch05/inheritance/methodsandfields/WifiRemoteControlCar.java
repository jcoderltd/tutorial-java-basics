/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.methodsandfields;

/**
 * Example class used to show methods and fields when inheritance is involved.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/inheritancemethodsandfields
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class WifiRemoteControlCar extends RemoteControlCar {

    @Override
    public void printDescription() {
        System.out.println("This RemoteControlCar can be controlled via WiFi");
        super.printDescription();
    }
    
    public void printWifiCarFromAge() {
        int minAge = super.fromAge;
        System.out.println("This wifi car is suitable from age: " + minAge);
    }
    
    public void printFromAge() {
        System.out.println("This wifi car is suitable from age: " + fromAge);
    }

}
