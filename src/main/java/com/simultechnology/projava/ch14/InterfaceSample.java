package com.simultechnology.projava.ch14;

import java.util.List;

@FunctionalInterface
interface Named {
    String name();

    default String greeting() {
        return "hello, %s".formatted(this.name());
    }
}

public class InterfaceSample {
    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}

    record Staff(String name, String job) implements Named {}


    public static void main(String[] args) {
        System.out.println("start");
        var people = List.of(
                new Student("ishi", 90),
                new Teacher("michel", "English"),
                new Passenger(),
                new Staff("taka", "SE")
        );
        for (Named p: people) {
//            System.out.println(p.name());
//            var n=
//                    p instanceof Student s ? s.name() :
//                    p instanceof Teacher t ? t.name() :
//                            "---";
            System.out.printf("Hello, %s!%n", p.name());
            System.out.println(p.greeting());
        }
    }

    static class Passenger implements Named {
        @Override
        public String name() {
            return "pass";
        }
    }
}
