/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.inheritance.basics;

/**
 * 
 * @author Camilo Gonzalez
 */
public class JavaExtendsApp {
    public static void main(String[] args) {
        CommercialAirplane commercialAirplane = new CommercialAirplane();

        // we can invoke methods defined in the CommercialAirplane class as expected
        commercialAirplane.boardPassenger();
        System.out.println("Number of passengers on board: " + commercialAirplane.getPassengersOnBoard());

        // as the class inherits from Airplane, we can also invoke methods defined in the Airplane class
        commercialAirplane.setManufacturer("Airbus");
        commercialAirplane.setNumberOfSeats(300);
        commercialAirplane.takeOff();
        commercialAirplane.retractLandingGear();
        commercialAirplane.printDetails();
    }
}
