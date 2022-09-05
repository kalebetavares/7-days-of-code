package br.com.seven.days.code.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ImdbApiClient implements ApiClient {
    private static final String API_IMDB = "<private key>";
    private String fileJson;

    public ImdbApiClient() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(API_IMDB))
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        this.fileJson = httpResponse.body();
    }

    @Override
    public String getFileJson() {
        return this.fileJson;
    }
}
