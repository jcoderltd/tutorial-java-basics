/*
 * Copyright 2020 - JCoder Ltd
 */
package io.jcoder.tutorials.ch12;

import java.util.Set;

/**
 * Interface used in the Vending Machine Project.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch12/
 * </p>
 * 
 * @author Andres Ricardo Perez
 */

public interface ProductCatalog {

    Set<ProductDetail> getProducts();

}
