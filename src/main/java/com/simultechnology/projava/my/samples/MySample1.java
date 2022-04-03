package com.simultechnology.projava.my.samples;

public class MySample1 {
    public static void main(String[] args) {
        int count = 3;
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append('0' + count);
        builder.append((char) ('0' + count));
        System.out.println(builder.toString());
        System.out.println(Character.getNumericValue(count));

        var s = "s";
        System.out.println((char) '0' + s.charAt(0));
    }
}
