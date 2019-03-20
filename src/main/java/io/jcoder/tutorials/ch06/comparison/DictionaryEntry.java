/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.comparison;

import java.util.Objects;

/**
 * Example class used to explain object comparison in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objectcomparison
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class DictionaryEntry implements Comparable<DictionaryEntry> {
    private final String word;

    private final String definition;

    public DictionaryEntry(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }
    
    public String getWord() {
        return word;
    }
    
    @Override
    public int compareTo(DictionaryEntry o) {
        return word.compareTo(o.word);
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
