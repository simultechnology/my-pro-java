package com.simultechnology.projava.ch13;

public class RunLengthCompression {
    public static void main(String[] args) {
        final var COUNTER_BASE = -1;
        var data = "abbcccbaaaabcccccccccccccddd";

        var count = COUNTER_BASE;
        char prev = 0;
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            System.out.println(ch);
            if (prev == ch) {
                // when same char continues
                count++;
                if (count == 9) {
                    builder.append('9');
                    count = COUNTER_BASE;
                    prev = 0;
                }
            } else {
                // when different char comes
                if (count >= 0) {
                    builder.append((char) ('0' + count));
                    count = COUNTER_BASE;
                }
                builder.append(ch);
                prev = ch;
            }
        }
        if (count >= 0) {
            builder.append((char) ('0' + count));
        }
        String result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
