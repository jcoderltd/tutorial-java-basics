/*
 * Copyright 2017 the original author or authors.
 */
package io.jcoder.tutorials.ch01.dotoperator;

/**
 * Example Door class used in the dot (.) operator section.
 * 
 * @author Camilo Gonzalez
 */
public class Door {
    public boolean locked = false;

    public void lockDoor() {
        locked = true;
    }

    public void unlockDoor() {
        locked = false;
    }
}
