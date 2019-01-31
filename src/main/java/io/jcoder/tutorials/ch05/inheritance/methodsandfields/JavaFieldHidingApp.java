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
public class JavaFieldHidingApp {
    
    public static void main(String[] args) {
        RemoteControlCar car = new RemoteControlCar();
        
        // we can change the fromAge value defined in the RemoteControlCar class 
        car.fromAge = 15;
        // and as expected the fromAge in the message below should be 15
        System.out.println("The min age for the RemoteControlCar is: " + car.fromAge);
        
        // however, we don't have access to the fromAge field of the Toy car (it is hidden),
        // unless of course, we use a method that provides us access to its value, like the
        // Toy.printFromAgeDetails() method we defined
        car.printFromAgeDetails();
    }
    
}
