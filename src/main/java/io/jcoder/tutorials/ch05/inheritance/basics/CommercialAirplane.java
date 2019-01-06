/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.basics;

/**
 * Basic example of a class representing an CommercialAirplane (used for Chapter 5).
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/inheritance
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class CommercialAirplane extends Airplane {
    
    private int passengersOnBoard;
    
    public void boardPassenger() {
        passengersOnBoard++;
    }
    
    public int getPassengersOnBoard() {
        return passengersOnBoard;
    }
    
}
