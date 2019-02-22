/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch05.finalkeyword;

/**
 * Example class used to explain the final keyword in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch05/final
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class DictionaryEntry {
    private static final String WORD_SEPARATOR = ": ";
    
    private final String word;

    private final String definition;

    public DictionaryEntry(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public final void printEntry() {
        System.out.println(word + WORD_SEPARATOR + definition);
    }
}
