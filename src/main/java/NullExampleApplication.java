/*
 * Copyright 2018 - JCoder Ltd
 */

/**
 * Basic example of a Java application that illustrates the `null` value.
 */
public class NullExampleApplication {
  
    public static void main(String[] args) {
        Airplane plane = null;
        
        System.out.println("The plane is: " + plane);
        
        plane.land();
        
        System.out.println("End of program");
    }
}
