package com.simultechnology.projava.ch13;

public class ChangeOddEven {
    public static void main(String[] args) {
        var data = "abcdefghi";

        StringBuilder builder = new StringBuilder();
        int length = data.length();
        for (var i = 0; i < length; i +=2) {
            char even = data.charAt(i);
            if (i + 1 < length) {
                char odd = data.charAt(i + 1);
                builder.append(odd);
            }
            builder.append(even);
        }
        System.out.println(builder.toString());
    }
}
