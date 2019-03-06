/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.casting;

/**
 * Example class used to explain the instanceof (type comparison) operator and object casting
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/casting
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaTypeCastingExceptionApp {
    
    public static void main(String[] args) {
        Light light1 = new BluetoothLight();
        WiFiLight light2 = (WiFiLight) light1;
    }
    
}
