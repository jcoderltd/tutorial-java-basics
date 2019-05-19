/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.hashmap;

/**
 * Example class used to explain Maps in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/hashmap
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class User {
    private final int userId;

    private final String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + "]";
    }
}
