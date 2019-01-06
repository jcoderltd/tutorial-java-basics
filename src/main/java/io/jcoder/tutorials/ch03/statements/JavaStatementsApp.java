/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.statements;

import io.jcoder.tutorials.ch01.dotoperator.Door;

/**
 * Example class used in the Expressions and Statements section of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch03/expressions<br>
 * https://jcoder.io/content/course/java/beginners/ch03/statements
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaStatementsApp {

    public static void main(String[] args) {
        int a;

        // '2 + 3' on its own is a valid expression, but not a valid statement
        // the full line of code however, is a valid statement and also a compound expression.
        a = 2 + 3;

        // we can have a compound expression when joining smaller expressions, like 1 * 2 + 3 * 4;
        // it is good practice however to use parenthesis to clarify the order in which they must 
        // be executed.
        int b = 1 * (2 + 3) * 4;
        
        int c = 1 * 2 + 3 * 4;
        
        System.out.println(b);
        System.out.println(c);
        
        // declaration statements
        int number;
        Door door;
        
        // object creation statement
        door = new Door();
        // method invocation statements
        door.lockDoor();
        System.out.println("Is door locked? " + door.locked);
        // assignment statement
        number = 1;
        // decrement statement
        number--;
        // increment statement
        number++;
    }

}
