/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Example class used in the Branching Statements section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch03/branchingstatements
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class PerimeterCalculator {

    public void printSquarePerimeter(int side) {
        if (side <= 0) {
            return;
        }
        System.out.println("The perimeter of a square of side " + side + " is: " + (side * 4));
        return;
    }

    public int squarePerimeter(int side) {
        int perimeter = 4 * side;
        return perimeter;
    }

}
