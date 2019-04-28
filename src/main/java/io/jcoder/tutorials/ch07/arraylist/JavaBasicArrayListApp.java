/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Example class used to explain ArrayList and List in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/list
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicArrayListApp {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>();
        System.out.println("Initial size of the list: " + sentence.size());

        sentence.add("This");
        sentence.add("is");
        sentence.add("a");
        sentence.add("sentence");
        
        String secondWord = sentence.get(1);
        System.out.println("Second word: " + secondWord);

        for (String word : sentence) {
            System.out.println(word);
        }
        
        System.out.println("Sentence contains a: " + sentence.contains("a"));
        System.out.println("Sentence contains b: " + sentence.contains("b"));
        
        System.out.println("Index of a: " + sentence.indexOf("a"));
        System.out.println("Index of b: " + sentence.indexOf("b"));
    }
}
