/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.comparison;

/**
 * Example class used to explain object comparison in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objectcomparison
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaObjectComparisonApp {
    public static void main(String[] args) {
        DictionaryEntry alpha = new DictionaryEntry("alpha", "definition of alpha");
        DictionaryEntry beta = new DictionaryEntry("beta", "definition of beta");

        System.out.println("Alpha compared to beta: " + alpha.compareTo(beta));
        System.out.println("Beta compared to alpha: " + beta.compareTo(alpha));
    }
}
