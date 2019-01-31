/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.constructors;

/**
 * Example class used to show constructors when inheritance is involved.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/inheritanceandconstructors
 * </p>
 *  
 * @author Camilo Gonzalez
 */
public class JavaInheritanceAndConstructorsApp {

    public static void main(String[] args) {
        DimmableLight dimmableLight = new DimmableLight(true, 50);
        dimmableLight.printDimmableLightDetails();
    }
    
}
