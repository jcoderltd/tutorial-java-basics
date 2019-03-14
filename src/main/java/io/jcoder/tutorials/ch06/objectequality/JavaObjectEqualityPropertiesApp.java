/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.objectequality;

/**
 * Example class used to explain object equality in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objectequality
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaObjectEqualityPropertiesApp {

    public static void main(String[] args) {
        DictionaryEntry run1 = new DictionaryEntry("run", "definition of run");

        System.out.println("Reflective property:");
        System.out.println("run1 equals itself: " + run1.equals(run1));

        DictionaryEntry run2 = new DictionaryEntry("run", "definition of run");
        System.out.println("Symmetric property:");
        System.out.println("run1 equals run2: " + run1.equals(run2));
        System.out.println("run2 equals run1: " + run2.equals(run1));

        DictionaryEntry run3 = new DictionaryEntry("run", "definition of run");
        System.out.println("Transitive property:");
        System.out.println("run1 equals run2: " + run1.equals(run2));
        System.out.println("run2 equals run3: " + run2.equals(run3));
        System.out.println("run1 equals run3: " + run1.equals(run3));

        System.out.println("Not equal to null:");
        System.out.println("run1 equals null: " + run1.equals(null));

        DictionaryEntry stop = new DictionaryEntry("stop", "definition of stop");
        System.out.println("Not equal to different DictionaryEntry: ");
        System.out.println("run1 equals stop: " + run1.equals(stop));
    }

}
