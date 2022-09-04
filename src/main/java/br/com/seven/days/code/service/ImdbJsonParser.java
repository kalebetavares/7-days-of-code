package br.com.seven.days.code.service;

import br.com.seven.days.code.model.Movie;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImdbJsonParser implements JsonParsing{

    @Override
    public List<Movie> parse(String json){
        List<String> title = parseTitle(json);
        List<String> urlImage = parseUrlImage(json);
        List<String> rating = parseRating(json);
        List<String> year = parseYear(json);

        List<Movie> movies = new ArrayList<>(title.size());

        for(int i = 0; i < title.size(); i++){
            movies.add(new Movie(title.get(i), urlImage.get(i), rating.get(i), year.get(i)));
        }

        return movies;
    }

    private static List<String> parseTitle(String json){
        return parseAttribute("title", json);
    }

    private static List<String> parseUrlImage(String json){
        return parseAttribute("image", json);
    }

    private static List<String> parseRating(String json){
        return parseAttribute("imDbRating", json);
    }

    private static List<String> parseYear(String json){
        return parseAttribute("year", json);
    }

    private static List<String> parseAttribute(String attribute, String json){
        Matcher matcher = Pattern.compile("\""+attribute+"\":\"(.*?)\"").matcher(json);
        List<String> resultAttribute = new ArrayList<>();
        for (int i = 0; i < 250; i++){
            if (!matcher.find()){
                throw new IllegalArgumentException();
            }
            resultAttribute.add(matcher.group(1));
        }
        return resultAttribute;
   }
}
