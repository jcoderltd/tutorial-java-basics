/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch04;

/**
 * Example class used in the Simple Vending Machine project of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch04/problemdefinition
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaIfElseStatementApp {

    public static void main(String[] args) {
        // create a new vending machine
        UnlimitedSupplyVendingMachine vendingMachine = new UnlimitedSupplyVendingMachine();

        // our initial balance should be 0
        System.out.println("Initial balance: " + vendingMachine.getBalance());

        // we haven't added any money yet, so the first delivery attempt should be false
        boolean firstDelivery = vendingMachine.deliverItem();
        System.out.println("First item delivery attempt: " + firstDelivery);

        // Now, let's add 10 to the vending machine
        vendingMachine.addMoney(10);
        // we expect a balance of 10.
        System.out.println("Balance after adding money: " + vendingMachine.getBalance());

        // and let's try again to get an item, this time we have enough money:
        boolean secondDelivery = vendingMachine.deliverItem();
        System.out.println("Second item delivery attempt: " + secondDelivery);

        // and let's also check that the balance is updated
        System.out.println("Balance after getting the item: " + vendingMachine.getBalance());
    }

}
