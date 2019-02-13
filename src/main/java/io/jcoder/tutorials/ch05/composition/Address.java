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
public class Address {
    
    private String address;

    private String city;

    private String country;

    public Address(String address, String city, String country) {
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public void printAddress() {
        System.out.println(address + ", " + city + ", " + country);
    }

}
