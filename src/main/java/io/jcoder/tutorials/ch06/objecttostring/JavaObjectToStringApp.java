/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.objecttostring;

/**
 * Example class used to explain Object's toString method in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objecttostring
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaObjectToStringApp {

    public static void main(String[] args) {
        DictionaryEntry walk = new DictionaryEntry("walk", "definition of walk");
        String result = "The object is: " + walk;
        System.out.println(result);
    }

}
