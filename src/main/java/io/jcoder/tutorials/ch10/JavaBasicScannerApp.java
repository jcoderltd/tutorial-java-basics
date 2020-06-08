/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch10;

import java.util.Scanner;

public class JavaBasicScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.print("Enter operation (add / subtract / multiply) to perform: ");
        String operation = scanner.next();

        int answer = 0;
        if (operation.equals("add")) {
            // add
            answer = firstInteger + secondInteger;
            System.out.println(firstInteger + " + " + secondInteger + " = " + answer);
        } else if (operation.equals("subtract")) {
            // subtract
            answer = firstInteger - secondInteger;
            System.out.println(firstInteger + " - " + secondInteger + " = " + answer);
        } else if (operation.equals("multiply")) {
            // multiply
            answer = firstInteger * secondInteger;
            System.out.println(firstInteger + " * " + secondInteger + " = " + answer);
        } else {
            System.out.println("Invalid operation name provided.");
        }

        scanner.close();
    }
}
