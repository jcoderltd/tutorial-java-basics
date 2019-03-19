/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.generics;

/**
 * Example class used to introduce generics.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/genericclasses
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaGenericClassApp {
    public static void main(String[] args) {
        Gift<Toy> gift = new Gift<Toy>(new Toy("RC Car"), "John", "Jane");
        Toy giftedToy = gift.getGiftItem();
        gift.printGiftFromTo();
        giftedToy.printDescription();
        
        Gift<Toy> anonymousGift = Gift.anonymousGift(new Toy("Drone"), "Jack");
        anonymousGift.printGiftFromTo();
    }
}
