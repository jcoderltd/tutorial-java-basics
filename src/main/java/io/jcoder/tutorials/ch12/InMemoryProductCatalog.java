/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch12;

import java.util.HashSet;
import java.util.Set;

/**
 * Class used in the Vending Machine Project.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch12/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */
public class InMemoryProductCatalog implements ProductCatalog {

    private Set<ProductDetail> products;

    public InMemoryProductCatalog(Set<ProductDetail> products) {
        this.products = new HashSet<ProductDetail>(products);
    }

    @Override
    public Set<ProductDetail> getProducts() {
        return products;
    }

}
