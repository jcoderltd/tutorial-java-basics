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
public class JavaObjectComparatorApp {
    public static void main(String[] args) {
        DictionaryEntry ant = new DictionaryEntry("ant", "definition of ant");
        DictionaryEntry bat = new DictionaryEntry("bat", "definition of bat");
        DictionaryEntry ox = new DictionaryEntry("ox", "definition of ox");

        WordLengthComparator wordLengthComparator = new WordLengthComparator();

        System.out.println("Ox compared to ant: " + wordLengthComparator.compare(ox, ant));
        System.out.println("Ox compared to bat: " + wordLengthComparator.compare(ox, bat));
        System.out.println("Ant compared to bat: " + wordLengthComparator.compare(ant, bat));
    }
}
