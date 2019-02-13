/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.composition;

/**
 * Example class used to explain the concept of composition in Java.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/composition
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Administrator extends User {

    private Store store;

    public Administrator(String username, Address address, Store store) {
        super(username, address);
        this.store = store;
    }

    @Override
    public void printUserAddress() {
        System.out.println("Administrator of Store:");
        store.printStoreAddress();
        super.printUserAddress();
    }
    
}
