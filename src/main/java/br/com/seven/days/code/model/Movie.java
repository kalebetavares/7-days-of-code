package br.com.seven.days.code.model;

import br.com.seven.days.code.service.Content;

public class Movie implements Content {
    private String title;
    private String urlImage;
    private String rating;
    private String year;

    public Movie(String title, String urlImage, String rating, String year) {
        this.title = title;
        this.urlImage = urlImage;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String title() {
        return this.title;
    }

    @Override
    public String urlImage() {
        return this.urlImage;
    }

    @Override
    public String rating() {
        return this.rating;
    }

    @Override
    public String year() {
        return this.year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title:'" + this.title + '\'' +
                ", urlImage:'" + this.urlImage + '\'' +
                ", rating:'" + this.rating + '\'' +
                ", year:'" + this.year + '\'' +
                '}';
    }
}
