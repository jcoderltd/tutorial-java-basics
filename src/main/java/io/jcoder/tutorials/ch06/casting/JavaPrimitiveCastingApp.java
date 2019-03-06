/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch06.casting;

/**
 * Example class used to explain the instanceof (type comparison) operator and object casting
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch06/casting
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaPrimitiveCastingApp {
    
    public static void main(String[] args) {
        byte a = 8;
        int b = a;
        
        System.out.println("The byte is equal to: " + a);
        System.out.println("The int is equal to: " + b);
        
        long c = 10;
        short d = (short) c;
        
        System.out.println("The long is equal to: " + c);
        System.out.println("The short is equal to: " + d);
        
        System.out.println("Overflow example: ");
        
        int largerThanByte = 128;
        byte overflow = (byte) largerThanByte;
        System.out.println("The largerThanByte int is equal to: " + largerThanByte);
        System.out.println("The casted byte is equal to: " + overflow);
    }
    
}
