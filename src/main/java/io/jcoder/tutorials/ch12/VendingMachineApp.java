/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch12;

import java.util.HashSet;
import java.util.Set;

/**
 * Vending Machine App used in the Vending Machine Project.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch12/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class VendingMachineApp {

    public static void main(String[] args) {
        Set<ProductDetail> products = new HashSet<>();
        products.add(new ProductDetail("001", 2.50, "Potato Chips"));
        products.add(new ProductDetail("002", 3.00, "Soda"));
        products.add(new ProductDetail("003", 1.50, "Cookies"));
        products.add(new ProductDetail("004", 2.00, "Gummy Bears"));
        products.add(new ProductDetail("005", 2.50, "Apple"));

        ProductCatalog catalog = new InMemoryProductCatalog(products);

        VendingMachine machine = new VendingMachine(catalog);

        CLI cli = new CLI(machine);

        cli.run();
    }

}
