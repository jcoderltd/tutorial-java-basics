/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.casting;

/**
 * Example class used to explain the instanceof (type comparison) operator and object casting
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/typecomparison
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaTypeComparisonApp {

    public static void main(String[] args) {
        Light light1 = new BluetoothLight();
        Light light2 = new WiFiLight();

        LightIdentifier lightIdentifier = new LightIdentifier();
        lightIdentifier.identify(light1);
        lightIdentifier.identify(light2);
        lightIdentifier.identify(null);
    }

}
