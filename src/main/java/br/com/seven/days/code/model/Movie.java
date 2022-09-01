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

    public String getTitle() {
        return this.title;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public String getRating() {
        return this.rating;
    }

    public String getYear() {
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
