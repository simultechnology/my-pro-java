package com.simultechnology.projava.ch13;

public class RunLengthUnCompression {
    public static void main(String[] args) {
        var data = "ab0c1ba2bc9c0d1";

        char prev = 0;
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (Character.isDigit(ch)) {
                String repeated = new String(new char[Character.getNumericValue(ch) + 1]).replace('\0', prev);
                builder.append(repeated);
                prev = 0;
            } else {
                if (prev !=ch) {
                    builder.append(ch);
                }
                prev = ch;
            }
        }
        String result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
