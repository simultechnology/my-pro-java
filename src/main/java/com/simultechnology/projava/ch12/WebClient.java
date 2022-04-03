package com.simultechnology.projava.ch12;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WebClient {

    public static void main(String[] args) throws IOException {
        var domain = "google.com";
        SocketFactory aDefault = SSLSocketFactory.getDefault();
        try (var soc = aDefault.createSocket(domain, 443);
            PrintWriter printWriter = new PrintWriter(soc.getOutputStream());
            InputStreamReader inputStreamReader = new InputStreamReader(soc.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            printWriter.println("GET /index.html HTTP/1.1");
            printWriter.println("Host: " + domain);
            printWriter.println();
            printWriter.flush();
            bufferedReader.lines()
                    .limit(18)
                    .forEach(System.out::println);
        }
    }
}
