/*
 * Copyright 2017 the original author or authors.
 */


public class AirplaneApplication {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        
        plane1.setManufacturer("Boeing");
        plane1.setNumberOfSeats(270);
        plane1.printDetails();
        
        Airplane plane2 = plane1;
        plane2.printDetails();
        
        Airplane plane3 = new Airplane();
        plane3.setManufacturer("Airbus");
        plane3.setNumberOfSeats(300);
        plane3.deployLandingGear();
        plane3.land();
        plane3.printDetails();
        
        System.out.println("plane1 is pointing to the same instance as plane2: " + (plane1 == plane2));
        System.out.println("plane1 is pointing to the same instance as plane3: " + (plane1 == plane3));
    }
}
