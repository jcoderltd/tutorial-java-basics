/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch12;

/**
 * Class used in the Vending Machine Project.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch12/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class VendingMachine {

    private static final double MAX_ALLOWED_BALANCE = 1000.00;
    private final ProductCatalog catalog;
    private double balance = 0.00;

    public VendingMachine(ProductCatalog catalog) {
        if (catalog == null || catalog.getProducts() == null || catalog.getProducts().isEmpty()) {
            throw new IllegalArgumentException("catalog is null or empty");
        }
        for (ProductDetail product : catalog.getProducts()) {
            if (product.getPrice() > MAX_ALLOWED_BALANCE) {
                throw new IllegalArgumentException("Price of a product exceeds " + MAX_ALLOWED_BALANCE);
            }
        }
        this.catalog = catalog;
    }

    public ProductCatalog getProductCatalog() {
        return catalog;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amountToAdd) {
        // only add the money to the balance if it doesn't exceed the allowed maximum
        if (balance + amountToAdd <= MAX_ALLOWED_BALANCE) {
            balance += amountToAdd;
        }
    }

    public double giveChange() {
        double changeToGive = balance;
        balance = 0;
        return changeToGive;
    }

    public boolean deliverItem(String productCode) {
        // Go through all items until finding the chosen one,
        // then deduct the cost and return true only if there
        // is enough balance.
        for (ProductDetail product : catalog.getProducts()) {
            if (product.getProductCode().equals(productCode)) {
                if (balance >= product.getPrice()) {
                    balance -= product.getPrice();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
