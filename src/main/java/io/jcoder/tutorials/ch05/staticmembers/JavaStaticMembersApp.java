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
public class JavaStaticMembersApp {

    public static void main(String[] args) {
        Game game1 = new Game("chess");

        // so far we've only created one instance and the max length so far is 5 ("chess")
        Game.printMaximumGameTitleLength();

        Game game2 = new Game("football");

        // "football" has 8 characters, so we expect our maximum to be 8 now
        Game.printMaximumGameTitleLength();

        Game game3 = new Game("go");

        // maximum is still 8
        Game.printMaximumGameTitleLength();
    }

}
