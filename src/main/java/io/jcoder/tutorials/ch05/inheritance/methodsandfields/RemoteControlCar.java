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
public class RemoteControlCar extends Toy {

    int fromAge;
    
    public RemoteControlCar() {
        super("Remote Control Car", 10);
        fromAge = 10;
    }

    @Override
    public void printDescription() {
        System.out.println("*** RemoteControlCar class ***");
        System.out.println("This is a remote control car and is suitable from " + fromAge + " years");
    }

}
