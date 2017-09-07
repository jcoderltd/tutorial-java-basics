/*
 * Copyright 2017 the original author or authors.
 */
package io.jcoder.tutorials.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This demo class shows how to convert to/from Strings from/to array objects.
 * 
 * <p>
 * Each method shows a demo of a different conversion/case.
 * </p>
 */
public class StringArrayConversions {

    private final Person[] peopleArray = new Person[] {
            new Person("Miss", "Jane", "Doe"),
            new Person("Mr", "John", "Doe"),
            new Person("Mr", "Name", "Surname")
    };

    /**
     * Convert an array to a String using the Stream interface.
     */
    public void arrayToStringViaStream() {
        String resultString = Stream.of(peopleArray)
                .map(Person::toString)
                .collect(Collectors.joining(", "));
        System.out.println(resultString);
    }

    /**
     * Convert an array to a String using the Stream interface (lambda instead of method reference).
     * 
     * <p>
     * Example provided if the reader isn't familiar with the <em>::</em> notation.
     * </p>
     */
    public void arrayToStringViaStreamUsingLambda() {
        String resultString = Stream.of(peopleArray)
                .map(person -> {
                    return person.toString();
                })
                .collect(Collectors.joining(", "));
        System.out.println(resultString);
    }

    /**
     * Convert an array to a String using a for-each loop and a StringBuilder.
     */
    public void arrayToStringForEach() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Person p : peopleArray) {
            stringBuilder.append(p.toString() + "\n");
        }
        System.out.println(stringBuilder.toString());
    }

    /**
     * Convert an array to a String using a for-each loop and a StringBuilder, including a check to only add the
     * delimiter in-between elements.
     */
    public void arrayToStringForEachWithDelimiterCheck() {
        boolean firstElement = true;
        StringBuilder stringBuilder = new StringBuilder();
        for (Person p : peopleArray) {
            if (firstElement) {
                firstElement = false;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(p.toString());
        }
        System.out.println(stringBuilder.toString());
    }

    /**
     * Convert an array to a String using the {@link Arrays} class.
     */
    public void arrayToStringArrays() {
        String resultString = Arrays.toString(peopleArray);
        System.out.println(resultString);
    }

    public static void main(String[] args) {
        StringArrayConversions stringConversions = new StringArrayConversions();

        stringConversions.arrayToStringViaStream();
        stringConversions.arrayToStringViaStreamUsingLambda();

        stringConversions.arrayToStringForEach();
        stringConversions.arrayToStringForEachWithDelimiterCheck();

        stringConversions.arrayToStringArrays();
    }

    private static class Person {
        private String title;

        private String firstName;

        private String lastName;

        public Person(String title, String firstName, String lastName) {
            this.title = title;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return title + ". " + firstName + " " + lastName;
        }

    }
}
