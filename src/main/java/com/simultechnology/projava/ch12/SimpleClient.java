package com.simultechnology.projava.ch12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        System.out.println("start!");
        try (var soc = new Socket("127.0.0.1", 1600);
             OutputStream outputStream = soc.getOutputStream()) {
            outputStream.write("こんにちは！！".getBytes());
        }
    }
}
