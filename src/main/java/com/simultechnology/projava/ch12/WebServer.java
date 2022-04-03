package com.simultechnology.projava.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8880);
        var i = 0;;
        for (;;) {
            try (Socket soc = server.accept();
                InputStreamReader isr = new InputStreamReader(soc.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                PrintWriter w = new PrintWriter(soc.getOutputStream()))
            {
                System.out.println("connected from " + soc.getInetAddress());
                br.lines()
                        .takeWhile(line -> !line.isEmpty())
                        .forEach(System.out::println);
                System.out.println("-----------------------------------------");
                w.println("""
                        HTTP/1.1 200 OK
                        Content-Type: text/plain
                        
                        <html><head><title>Hello</title></head>
                        <body><h1>hello %d</h1></body></html>
                        """.formatted(i++));
            }
        }
    }
}
