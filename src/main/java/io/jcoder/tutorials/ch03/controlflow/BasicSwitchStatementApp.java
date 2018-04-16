/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Basic example used in the Switch Statements section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/switchstatement
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BasicSwitchStatementApp {

    public static void main(String[] args) {
        // example of a switch statement using break clauses

        // 0 -> Off, 1 -> Low, 2-> High
        int heatingPower = 1;
        String messageToDisplay;

        switch (heatingPower) {
            case 0:
                messageToDisplay = "Off";
                break;
            case 1:
                messageToDisplay = "Low";
                break;
            case 2:
                messageToDisplay = "High";
                break;
            default:
                messageToDisplay = "Invalid code!";
                break;
        }

        System.out.println("The heating is set to: " + messageToDisplay);

        // example of a switch statement without break clauses
        int minHeatingPower = 1;
        String availablePowerOptions = "";

        switch (minHeatingPower) {
            case 0:
                availablePowerOptions += "Off ";
            case 1:
                availablePowerOptions += "Low ";
            case 2:
                availablePowerOptions += "High";
        }

        System.out.println("The available heating options above the given minimum are: " + availablePowerOptions);
    }

}
