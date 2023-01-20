package com.simultechnology.projava.ch14;

import java.util.List;

public class MyInterfaceSample {
    interface Shape {
        int width();
        int height();
    }

    record Box(int width, int height) implements Shape {}
    record Oval(int width, int height) implements Shape {}

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
