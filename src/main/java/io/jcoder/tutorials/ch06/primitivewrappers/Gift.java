/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.primitivewrappers;

/**
 * Example class used to explain wrapper classes in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/primitivewrappers
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class Gift<T> {
    private T item;

    private String from;

    private String to;

    public Gift(T item, String from, String to) {
        this.item = item;
        this.from = from;
        this.to = to;
    }

    public T getGiftItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Gift [item=" + item + ", from=" + from + ", to=" + to + "]";
    }
}
