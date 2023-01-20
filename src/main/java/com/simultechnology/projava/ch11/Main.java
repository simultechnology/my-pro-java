package com.simultechnology.projava.ch11;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        recur(3);
    }

    private static int recur(int i) {
        if (i <= 0) {
            return 0;
        }
        System.out.println(i);
        return recur(i - 1);
    }
}
