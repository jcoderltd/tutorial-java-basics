/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.basics;

/**
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
