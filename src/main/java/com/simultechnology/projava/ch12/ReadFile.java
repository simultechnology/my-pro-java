package com.simultechnology.projava.ch12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("start!");
        try {
            var p = Path.of("samples.json");
            Files.readAllLines(p)
                    .forEach(System.out::println);
        } catch (NoSuchFileException e) {
            System.out.println("cannot find the file:" + e.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
