/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.objectequality;

/**
 * Example class used to explain object equality in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/objectequality
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaObjectEqualityApp {

    public static void main(String[] args) {
        DictionaryEntry word1 = new DictionaryEntry("run", "definition of run");
        DictionaryEntry word2 = new DictionaryEntry("stop", "definition of stop");
        
        System.out.println("word1 equals itself: " + word1.equals(word1));
        System.out.println("word1 equals word2: " + word1.equals(word2));

        DictionaryEntry word3 = new DictionaryEntry("run", "definition of run");
        System.out.println("word1 equals word3: " + word1.equals(word3));
        
        System.out.println("word1 equals null: " + word1.equals(null));
    }
    
}
