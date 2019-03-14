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
public class SimpleObject {
    private int id;
    
    public SimpleObject(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this + " finalized!");
    }

    @Override
    public String toString() {
        return "SimpleObject [id=" + id + "]";
    }
}
