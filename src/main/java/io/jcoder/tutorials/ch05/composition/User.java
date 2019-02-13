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
public class User {

    private String username;

    private Address address;

    public User(String username, Address address) {
        this.username = username;
        this.address = address;
    }

    public void printUserAddress() {
        System.out.println("Address for user '" + username + "' is: ");
        address.printAddress();
    }

}
