/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.methodsandfields;

/**
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
