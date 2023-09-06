package com.simultechnology.projava.ch14;

import java.util.List;

/**
 * Demonstrates the use of various {@link Shape} implementations.
 */
public class MyInterfaceSample {

    /**
     * Represents a geometric shape with width and height attributes.
     */
    interface Shape {
        /**
         * Returns the width of the shape.
         *
         * @return the width
         */
        int width();

        /**
         * Returns the height of the shape.
         *
         * @return the height
         */
        int height();
    }

    /**
     * Represents a box with specific width and height.
     */
    record Box(int width, int height) implements Shape {}

    /**
     * Represents an oval with specific width and height.
     */
    record Oval(int width, int height) implements Shape {}

    /**
     * Entry point of the application.
     * Demonstrates the use of Box and Oval and prints their width and height.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Box(100, 200),
                new Oval(300, 300)
        );
        for (Shape s : shapes) {
            System.out.printf("width: %d, height: %d\n", s.width(), s.height());
        }
    }
}
