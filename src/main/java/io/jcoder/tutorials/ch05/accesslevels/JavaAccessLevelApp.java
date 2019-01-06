/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.accesslevels;

/**
 * Example application to show different access level modifiers in Java.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/accessmodifiers
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaAccessLevelApp {

    public static void main(String[] args) {
        // Our Game class is defined as public hence we can access it from all classes (including this one)
        Game sampleGame = new Game();

        // The initialize method is defined as public, hence we can invoke it from this class
        sampleGame.initialize();

        // The printDetails method is actually default level, but as this class (JavaAccessLevelApp) lives on the same
        // package, we can make use of it
        sampleGame.printDetails();

        // The setTitle method is public so it's accessible from all classes
        // The setMaxPlayers, even though it is protected, this class (JavaAccessLevelApp) lives on the same package
        // so we can make use of it as well
        sampleGame.setTitle("Chess");
        sampleGame.setMaxPlayers(2);

        // If you uncomment the lines below, you should see the compiler error and IDE suggestions about what is going
        // on. These fields are not visible/accessible from this class as they are defined as private
        // sampleGame.title = "Another Game Name";
        // sampleGame.maxPlayers = 2;

        sampleGame.printDetails();
    }

}
