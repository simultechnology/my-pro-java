package com.simultechnology.projava.ch12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        System.out.println("start!");
        var message = """
                test
                今日は晴れです
                message
                """;
        var p = Path.of("test.txt");
        Files.writeString(p, message);
    }
}
