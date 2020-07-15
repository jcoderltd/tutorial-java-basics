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
public final class ProductDetail {

    private final String productCode;
    private final double price;
    private final String name;

    public ProductDetail(String productCode, double price, String name) {
        this.productCode = productCode;
        this.price = price;
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof ProductDetail)) {
            return false;
        }
        return ((ProductDetail) o).getProductCode().equals(this.productCode);
    }

    @Override
    public int hashCode() {
        return productCode.hashCode();
    }
}
