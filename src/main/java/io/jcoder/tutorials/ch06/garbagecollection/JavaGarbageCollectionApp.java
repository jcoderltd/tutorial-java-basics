/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.garbagecollection;

/**
 * Example class used to explain garbage collection in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/garbagecollection
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaGarbageCollectionApp {
    
    public static void main(String[] args) throws InterruptedException {
        GarbageProducer producer = new GarbageProducer();
        producer.produceObjects(10_000_000);
        System.out.println("Last object created was: " + producer.getLastObject());
    }
    
}
