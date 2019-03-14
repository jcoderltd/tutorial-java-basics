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
public class GarbageProducer {
    private SimpleObject lastObject;
    
    public void produceObjects(int numberOfObjects) {
        for (int i = 0; i < numberOfObjects; i++) {
            lastObject = new SimpleObject(i);
        }
    }
    
    public SimpleObject getLastObject() {
        return lastObject;
    }
}
