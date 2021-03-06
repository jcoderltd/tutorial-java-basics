/*
 * Copyright 2017 the original author or authors.
 */


/**
 * Basic example of a class representing an Airplane.
 */
public class Airplane {
    private String manufacturer;

    private int numberOfSeats;

    private boolean landed;

    private boolean gearDeployed;

    public void setManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }

    public void setNumberOfSeats(int newNumberOfSeats) {
        numberOfSeats = newNumberOfSeats;
    }

    public void takeOff() {
        landed = false;
    }

    public void land() {
        landed = true;
    }

    public void deployLandingGear() {
        gearDeployed = true;
    }

    public void retractLandingGear() {
        gearDeployed = false;
    }

    public void printDetails() {
        System.out.println("manufacturer=" + manufacturer + ", numberOfSeats=" + numberOfSeats + ", landed=" + landed
                + ", gearDeployed=" + gearDeployed);
    }

}
