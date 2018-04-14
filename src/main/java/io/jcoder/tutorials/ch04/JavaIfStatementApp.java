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
public class JavaIfStatementApp {

    public static void main(String[] args) {
        // create a new vending machine
        UnlimitedSupplyVendingMachine vendingMachine = new UnlimitedSupplyVendingMachine();

        // our initial balance should be 0
        System.out.println("Initial balance: " + vendingMachine.getBalance());

        // By adding 20, our new balance would not exceed the max allowed balance, so the condition is true
        vendingMachine.addMoney(20);
        // we expect a balance of 20 as it doesn't exceed the max allowed balance
        System.out.println("Balance after first addition of money: " + vendingMachine.getBalance());

        // By adding 90, our new balance would exceed the max allowed balance, so the addition shouldn't occur
        vendingMachine.addMoney(90);
        // we still expect a balance of 20.
        System.out.println("Balance after second addition of money: " + vendingMachine.getBalance());
    }

}
