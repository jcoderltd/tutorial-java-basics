/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.accesslevels;

/**
 * Example class used to show different access level modifiers in Java.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/accessmodifiers
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Game {
    private String title;

    private int maxPlayers;

    private boolean titleDefined;

    public void initialize() {
        title = "Unnamed Game";
        maxPlayers = 0;
        titleDefined = false;
    }

    public void setTitle(String gameTitle) {
        titleDefined = true;
        title = gameTitle;
    }

    protected void setMaxPlayers(int gameMaxPlayers) {
        maxPlayers = gameMaxPlayers;
    }

    void printDetails() {
        System.out.println("Game is: " + title + " with max players: " + maxPlayers + " - Title Set: " + titleDefined);
    }

}
