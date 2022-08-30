package br.com.seven.days.code.model;

public class Movie {
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
    public String toString() {
        return "Movie{" +
                "title:'" + this.title + '\'' +
                ", urlImage:'" + this.urlImage + '\'' +
                ", rating:'" + this.rating + '\'' +
                ", year:'" + this.year + '\'' +
                '}';
    }
}
