/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Basic example used in the More If Statements section of the Java for
 * Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/moreifstatements
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class MoreIfStatementsApp {

	public static void main(String[] args) {
		int age = 17;
		double discount = 1.0d;

		// example of a compound statement
		if (age >= 18) {
			discount = 0.0d;
			System.out.println("The age is 18 or over");
		} else if (age >= 15) {
			discount = 0.2d;
			System.out.println("The age is between 15 and 17");
		} else if (age >= 2) {
			discount = 0.5d;
			System.out.println("The age is between 2 and 14");
		} else if (age >= 0) {
			discount = 1.0d;
			System.out.println("The age is between 0 and 1");
		} else {
			discount = 0.0d;
			System.err.println("Incorrect age provided (negative value): " + age);
		}

		System.out.println("The discount to use is: " + discount);

		// example of a nested statement
		if (age >= 0) {
			if (age < 18) {
				discount = 1.0d;
				System.out.println("The age is between 0 and 17");
			} else {
				discount = 0.0d;
				System.out.println("The age is 18 or over");
			}
		} else {
			discount = 0.0d;
			System.err.println("Incorrect age provided (negative value): " + age);
		}

		System.out.println("The discount to use is: " + discount);

		// example of a single-line if statement - both are equivalent
		if (age > 0) {
			System.out.println("The age is positive.");
		}

		if (age > 0)
			System.out.println("The age is positive.");

	}

}
