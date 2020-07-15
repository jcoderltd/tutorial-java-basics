/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch12;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Command Line Interface Class used in the Vending Machine Project.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch12/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class CLI {

    private final VendingMachine machine;

    public CLI(VendingMachine machine) {
        this.machine = Objects.requireNonNull(machine, "machine should not be null");
    }

    public void printBalance() {
        System.out.println("\nCurrent Balance: $" + machine.getBalance());
    }

    private String getDisplayName(ProductDetail product) {
        return product.getProductCode() + " " + product.getName() + " " + product.getPrice();
    }

    public void printAvailableProducts() {
        System.out.println("Products available:");
        for (ProductDetail product : machine.getProductCatalog().getProducts()) {
            System.out.println(getDisplayName(product));
        }
    }

    public void printOptions() {
        System.out.println("\nPlease select an option:");
        System.out.println("1. Add Money");
        System.out.println("2. Request Change");
        System.out.println("3. Deliver Item");
        System.out.println("4. Exit");
    }

    public void addMoney(double moneyToAdd) {
        machine.addMoney(moneyToAdd);
    }

    public void giveChange() {
        System.out.println("\nYour change is: $" + machine.giveChange());
    }

    public boolean deliverItem(String code) {
        boolean success = machine.deliverItem(code);
        if (success) {
            System.out.println("Enjoy your product!");
        } else {
            System.out.println("Unable to deliver your product. Please try again.");
        }
        return success;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Vending Machine!");
        try {
            while (true) {
                printBalance();
                printAvailableProducts();
                printOptions();

                int option = scanner.nextInt();

                if (option == 1) {
                    System.out.println("\nHow much money will you add?");
                    double moneyToAdd = scanner.nextDouble();
                    addMoney(moneyToAdd);
                } else if (option == 2) {
                    giveChange();
                } else if (option == 3) {
                    System.out.println("\nPlease select a product using its code:");
                    String code = scanner.next();
                    deliverItem(code);
                } else if (option == 4) {
                    System.out.println("Goodbye.");
                    break;
                } else {
                    System.out.println("\nPlease select a valid option.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("\nAn invalid input was received.");
        } finally {
            scanner.close();
        }
    }

}
