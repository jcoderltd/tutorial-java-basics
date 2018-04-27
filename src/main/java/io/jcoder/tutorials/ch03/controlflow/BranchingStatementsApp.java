/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Example class used in the Branching Statements section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/branchingstatements
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class BranchingStatementsApp {

    public static void main(String[] args) {
        // Examples of the return statement - check the methods in the PerimeterCalculator class
        PerimeterCalculator calculator = new PerimeterCalculator();

        // first, let's print out the perimeter of a square of side 4:
        calculator.printSquarePerimeter(4);

        // next, let's try printing out the perimeter of a square of side -1, in this case,
        // nothing should be printed out:
        calculator.printSquarePerimeter(-1);

        // now, let's try using the squarePerimeter method and store the returned value in
        // the result variable:
        int result = calculator.squarePerimeter(2);
        System.out.println("A square of side 2 has a perimeter of: " + result);

        // Examples of the break statement
        int n = 10;
        int energy = 3;
        for (int i = 0; i < n; i++) {
            if (energy > 0) {
                System.out.println("I still have " + energy + " energy left!");
                energy--;
            } else {
                System.out.println("I can't do this anymore!");
                break;
            }
        }
    }

}
