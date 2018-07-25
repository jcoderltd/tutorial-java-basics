/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch04;

/**
 * Example class used in the Simple Vending Machine project of the Java for Beginners Course.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch04/problemdefinition
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaSimpleApp {

    public static void main(String[] args) {
        // create a new vending machine
        UnlimitedSupplyVendingMachine vendingMachine = new UnlimitedSupplyVendingMachine();

        // our initial balance should be 0
        System.out.println("Initial balance: " + vendingMachine.getBalance());

        vendingMachine.addMoney(30);
        System.out.println("Balance after first addition of money: " + vendingMachine.getBalance());

        boolean itemDelivered = vendingMachine.deliverItem();
        System.out.println("Item delivered?: " + itemDelivered);

        int change = vendingMachine.giveChange();
        System.out.println("Change to give: " + change);
        
        System.out.println("Final balance: " + vendingMachine.getBalance());
    }

}