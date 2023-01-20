package com.simultechnology.projava.ch10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamSample2 {
    public static void main(String[] args) {
        var nums = new int[]{2, 5, 3};
        int[] ints = IntStream.of(nums).map(n -> (int) Math.pow(n, 3)).toArray();
        System.out.println(Arrays.toString(ints));

        List<String> strings = IntStream.of(nums).mapToObj("*"::repeat).toList();
        System.out.println(strings);

    }
}
