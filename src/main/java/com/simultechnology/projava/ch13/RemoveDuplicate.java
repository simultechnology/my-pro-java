package com.simultechnology.projava.ch13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class RemoveDuplicate {
    public static void main(String[] args) {
        var data = "abcccbaabcc";

        StringBuilder builder = new StringBuilder();
        for (var i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (i > 0 && c == data.charAt(i - 1)) {
                continue;
            }
            builder.append(c);
        }
        System.out.println(builder.toString());
    }
}
