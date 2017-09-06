/*
 * Copyright 2017 the original author or authors.
 */
package io.jcoder.tutorials.string;

/**
 * This demo class shows how to convert to/from Strings from/to int values.
 * 
 * <p>Each method shows a demo of a different conversion/case.</p>
 */
public class StringToIntConversions {
    /**
     * Using {@link Integer#parseInt(String)} to convert a String to an int.
     */
    public void stringToInt() {
        String testString = "123";
        int parsedInt = Integer.parseInt(testString);
        System.out.println(parsedInt);
    }

    /**
     * Using {@link Integer#parseInt} when the String to be parsed is not a valid number. {@link NumberFormatException}
     * should be thrown.
     */
    public void stringToIntException() {
        String testString = "thisIsNotANumber";
        try {
            Integer.parseInt(testString);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Using {@link Integer#parseInt(String, int)} to convert numbers that aren't in base ten.
     */
    public void binaryStringToInt() {
        String binaryString = "100";
        int parsedInt = Integer.parseInt(binaryString, 2);
        System.out.println(parsedInt);
    }

    /**
     * Using {@link Integer#toString(int)} to convert an int value to a String.
     */
    public void intToString() {
        int number = 100;
        String resultString = Integer.toString(number);
        System.out.println(resultString);
        
        // other options include:
        resultString = String.valueOf(number);
        resultString = "" + number;
        resultString = String.format("%d", number);
    }

    /**
     * Using {@link Integer#toString(int, int)} to convert an int value to a String that represents the number is a
     * specific radix (binary in the example).
     */
    public void intToBinaryString() {
        int number = 16;
        String resultString = Integer.toString(number, 2);
        System.out.println(resultString);
    }

    public static void main(String[] args) {
        StringToIntConversions stringConversions = new StringToIntConversions();

        stringConversions.stringToInt();
        stringConversions.stringToIntException();
        stringConversions.binaryStringToInt();

        stringConversions.intToString();
        stringConversions.intToBinaryString();
    }
}
