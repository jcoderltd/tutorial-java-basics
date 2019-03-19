/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.generics;

/**
 * Example class used to introduce the concept of generic classes
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/genericclasses
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

    public void printGiftFromTo() {
        System.out.println("Gift from " + from + " to " + to);
    }

    public static <S> Gift<S> anonymousGift(S item, String to) {
        return new Gift<S>(item, "?", to);
    }
}
