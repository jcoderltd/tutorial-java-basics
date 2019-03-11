/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.objecttostring;

import java.util.Objects;

/**
 * Example class used to explain Object's toString method in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objecttostring
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class DictionaryEntry {
    private final String word;

    private final String definition;

    public DictionaryEntry(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "DictionaryEntry [word=" + word + ", definition=" + definition + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DictionaryEntry)) {
            return false;
        }
        DictionaryEntry other = (DictionaryEntry) obj;
        return Objects.equals(word, other.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
