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
public class JavaInheritanceAndMethodsApp {
    
    public static void main(String[] args) {
        Toy toyBoat = new Toy("Boat", 1);
        toyBoat.printDescription();
        
        System.out.println("--------------------------");
        
        RemoteControlCar toyCar = new RemoteControlCar();
        toyCar.printDescription();
        
        System.out.println("--------------------------");
        
        WifiRemoteControlCar wifiCar = new WifiRemoteControlCar();
        wifiCar.printDescription();
        
        System.out.println("--------------------------");
        
        wifiCar.printWifiCarFromAge();
    }
    
}
