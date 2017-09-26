/*
 * Copyright 2017 the original author or authors.
 */
package io.jcoder.tutorials.ch01.dotoperator;

/**
 * Example DoorApp class used in the dot (.) operator section.
 * 
 * @author Camilo Gonzalez
 */
public class DoorApp {

    public static void main(String[] args) {
        Door door = new Door();

        // invoking methods
        door.lockDoor();

        door.unlockDoor();

        // accessing fields (read)
        boolean isDoorLocked = door.locked;

        // accessing fields (write)
        door.locked = true;

        System.out.println("isDoorLocked variable = " + isDoorLocked);
        System.out.println("door.locked field = " + door.locked);
    }

}
