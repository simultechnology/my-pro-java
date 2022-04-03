package com.simultechnology.projava.ch12;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebClient2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        URI uri = URI.create("https://example.com/");
        HttpRequest request = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        body.lines()
//                .limit(5)
                .forEach(System.out::println);
    }
}
