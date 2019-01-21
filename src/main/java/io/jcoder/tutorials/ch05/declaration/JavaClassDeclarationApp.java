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
public class JavaClassDeclarationApp {
    
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        bedroomLight.printLightDetails();
        
        Light studioLight = new Light(true, "YELLOW");
        studioLight.printLightDetails();
        
        studioLight.setPower(100);
    }
    
}
