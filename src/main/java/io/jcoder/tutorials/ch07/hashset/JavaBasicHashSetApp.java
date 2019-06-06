/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * Example class used to explain HashSet and Set in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/hashset
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicHashSetApp {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Initial size of the set: " + numbers.size());

        numbers.add(10);
        System.out.println("New size of the set: " + numbers.size());

        boolean secondTenAdded = numbers.add(10);
        System.out.println("Was the second 10 added?: " + secondTenAdded);
        System.out.println("Size of the set after 2nd addition: " + numbers.size());

        numbers.add(20);
        numbers.add(30);

        for (Integer number : numbers) {
            System.out.println("Number in set: " + number);
        }
        
        System.out.println("Number 10 exists in the set?: " + numbers.contains(10));
        System.out.println("Number 15 exists in the set?: " + numbers.contains(15));
        
        numbers.remove(20);
        System.out.println("Number 20 exists in the set?: " + numbers.contains(20));
    }
}
