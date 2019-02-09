/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.staticmembers;

/**
 * Example class used to introduce the concept of static members.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/static
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Game {

    private static int maxGameTitleLength;

    private String title;

    public Game(String title) {
        this.title = title;

        if (title.length() > maxGameTitleLength) {
            maxGameTitleLength = title.length();
        }
    }

    public void printGame() {
        System.out.println("The game is called: " + title);
    }

    public static void printMaximumGameTitleLength() {
        System.out.println("The longest title length is: " + maxGameTitleLength);
    }

}
