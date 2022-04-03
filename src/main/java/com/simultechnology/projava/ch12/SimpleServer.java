package com.simultechnology.projava.ch12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        System.out.println("start!");
        ServerSocket serverSocket = new ServerSocket(1600);
        System.out.println("waiting...");
        try (Socket soc = serverSocket.accept();
             InputStream inputStream = soc.getInputStream()) {
            byte[] allBytes = inputStream.readAllBytes();
            System.out.println(Arrays.toString(allBytes));
            System.out.println(new String(allBytes));
        }
    }
}
