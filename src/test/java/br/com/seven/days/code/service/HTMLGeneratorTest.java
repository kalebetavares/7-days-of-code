package br.com.seven.days.code.service;

import br.com.seven.days.code.model.ImdbApiClientPrivateKey;
import br.com.seven.days.code.model.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

public class HTMLGeneratorTest {
    private OutputStream outputStream;
    private PrintWriter writerFile;
    private BufferedWriter bufferedWriter;
    private final String HEAD =
               """
               <!DOCTYPE html>
               <html lang="en">
               <head>
                   <meta charset="UTF-8">
                   <title>Top 250 Films by IMDB</title>
               </head>
               <body>                
               """;


    @BeforeEach
    public void constructorHTMLGenerator() throws FileNotFoundException {
        this.outputStream = new FileOutputStream("index.html");
        this.writerFile = new PrintWriter(outputStream);
        this.bufferedWriter = new BufferedWriter(writerFile);

        Assertions.assertNotNull(this.outputStream);
        Assertions.assertNotNull(this.writerFile);
        Assertions.assertNotNull(this.bufferedWriter);
    }

    @Test
    public void generate() throws IOException, InterruptedException {
        constructorHTMLGenerator();
        ImdbApiClientPrivateKey imdbApiClient = new ImdbApiClientPrivateKey();
        ImdbJsonParser imdbJsonParser = new ImdbJsonParser();

        List<Movie> movies = imdbJsonParser.parse((imdbApiClient.getFileJson()));

        this.writerFile.println(HEAD);
    }
}
