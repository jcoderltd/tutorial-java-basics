/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.comparison;

import java.util.Comparator;

/**
 * Example class used to explain object comparison in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objectcomparison
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class WordLengthComparator implements Comparator<DictionaryEntry> {
    @Override
    public int compare(DictionaryEntry word1, DictionaryEntry word2) {
        int lengthDifference = word1.getWord().length() - word2.getWord().length();
        if (lengthDifference == 0) {
            return word1.compareTo(word2);
        }
        return lengthDifference;
    }
}
