/*
 * Copyright 2018 - JCoder Ltd
 */
package io.jcoder.tutorials.ch03.controlflow;

/**
 * Simple Vending Machine class used for the examples in the JavaIfStatementApp.
 * 
 * <p>
 * https://jcoder.io/article/java/beginners/ch03/ifstatement
 * </p>
 * 
 * <p>
 * Our simple vending machine sells only one type of product with a fixed cost of 10 and will deliver an item only if
 * there is enough balance. Customers can add money to the vending machine, and can also request change if available.
 * The vending machine has an unlimited supply of items to deliver (for simplicity purposes!). The maximum balance it
 * can hold is 100.
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class UnlimitedSupplyVendingMachine {
    private int maxAllowedBalance = 100;

    private int costPerItem = 10;

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void addMoney(int amountToAdd) {
        if (balance + amountToAdd <= maxAllowedBalance) {
            // only add the money to the balance if it doesn't exceed the allowed maximum
            balance += amountToAdd;
        }
    }

    public boolean deliverItem() {
        // initially, define that no item has been delivered
        boolean itemDelivered = false;

        // if we have enough balance then deduct the cost of the item
        // from the balance and indicate that the item was delivered
        if (balance >= costPerItem) {
            balance -= costPerItem;
            itemDelivered = true;
        }
        return itemDelivered;
    }

}
