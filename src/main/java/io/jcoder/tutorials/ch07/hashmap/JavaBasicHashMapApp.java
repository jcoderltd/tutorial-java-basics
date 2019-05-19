/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch07.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Example class used to explain HashMap and Map in Java
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch07/hashmap
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public class JavaBasicHashMapApp {
    public static void main(String[] args) {
        Map<Integer, User> userMap = new HashMap<>();
        System.out.println("Initial size of the map: " + userMap.size());

        User user = new User(100, "Andy G.");
        userMap.put(user.getUserId(), user);

        User user2 = new User(244, "Jess J.");
        userMap.put(user2.getUserId(), user2);
        User user3 = new User(315, "Josh N.");
        userMap.put(user3.getUserId(), user3);
        User user4 = new User(9, "Paul D.");
        userMap.put(user4.getUserId(), user4);

        User mappedUser = userMap.get(244);
        System.out.println(mappedUser);

        User mappedUser2 = userMap.get(1000);
        System.out.println(mappedUser2);

        if (userMap.containsKey(100)) {
            System.out.println("Key 100 exists in the userMap");
        }

        userMap.remove(100);
        if (!userMap.containsKey(100)) {
            System.out.println("Key 100 doesn't exist in the userMap");
        }
    }
}
