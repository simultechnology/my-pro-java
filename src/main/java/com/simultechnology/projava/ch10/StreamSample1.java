package com.simultechnology.projava.ch10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample1 {
    public static void main(String[] args) {
        var data = List.of("koishikawa", "jun", "koshikawa");

        data.stream().filter(name -> name.length() >= 5)
                .forEach(System.out::println);

        var result = data.stream().
                filter(name -> name.length() >= 5)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);

        var result2 = data.stream().
                filter(name -> name.length() >= 5).toList();
//                .collect(Collectors.toList());
        System.out.println(result2);
    }
}
