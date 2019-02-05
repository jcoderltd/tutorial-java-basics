/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.polymorphism;

/**
 * Example class used to polymorphism.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/polymorphism
 * </p>
 *  
 * @author Camilo Gonzalez
 */
public class JavaPolymorphismApp {

    public static void main(String[] args) {
        Light normalLight = new Light();
        Light dimmableLight = new DimmableLight(25);

        dimmableLight.turnOff();
        
        // as the reference is of type Light we can't invoke the setPower method,
        // hence if uncommented the line below would generate a compilation error
        // dimmableLight.setPower(10);
        
        LightHandler handler = new LightHandler();
        handler.turnOn(normalLight);
        handler.turnOn(dimmableLight);
    }

}
