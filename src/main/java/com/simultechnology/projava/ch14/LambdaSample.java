package com.simultechnology.projava.ch14;

public class LambdaSample {
    public static void main(String[] args) {
        System.out.println("start!");

        message(() -> "aaaaa");
        message(new InterfaceSample.Student("John", 90));
    }

    static void message(Named named) {
        System.out.println("Hello, %s".formatted(named.name()));
    }
}
