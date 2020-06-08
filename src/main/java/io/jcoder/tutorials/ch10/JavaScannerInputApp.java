/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch10;

import java.util.Scanner;

public class JavaScannerInputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read a long from console
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();
        System.out.println("The entered long value is: " + longValue);

        //Read a double from console
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("The entered double value is: " + doubleValue);

        //Read a byte from console
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();
        System.out.println("The entered byte value is: " + byteValue);

        scanner.close();
    }
}
