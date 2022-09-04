package br.com.seven.days.code.service;

import br.com.seven.days.code.model.ImdbApiClient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class ImdbJsonParserTest {

    @Test
    public void parseAtribute() throws IOException, InterruptedException {
        ImdbApiClient imdbApiClient = new ImdbApiClient();
        String attribute = "fullTitle";
        Matcher matcher = Pattern.compile("\""+attribute+"\":\"(.*?)\"").matcher(imdbApiClient.getFileJson());
        List<String> titleFilms = new ArrayList<>();

            for (int i = 0 ; i < 250; i++) {
                Assertions.assertTrue(matcher.find());
                titleFilms.add(matcher.group(1));
            }

        titleFilms.forEach(System.out::println);
    }

}
