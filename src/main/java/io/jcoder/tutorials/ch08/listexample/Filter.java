/*
 * Copyright 2019 - JCoder Ltd
 */
package io.jcoder.tutorials.ch08.listexample;

/**
 * Example interface used to help introduce lambdas and anonymous classes in other sections of this chapter.
 * 
 * <p>
 * https://jcoder.io/content/course/java/beginners/ch08/listexample
 * </p>
 * 
 * @author Camilo Gonzalez
 */
public interface Filter<E> {

    boolean filter(E element);

}
