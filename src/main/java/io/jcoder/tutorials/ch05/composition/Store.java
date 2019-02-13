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
public class Store {

    private String storeName;

    private Address storeAddress;

    public Store(String storeName, Address storeAddress) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
    }

    public void printStoreAddress() {
        System.out.println("Address for store '" + storeName + "' is: ");
        storeAddress.printAddress();
    }

}
