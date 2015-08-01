package com.twu.biblioteca.entity;

/**
 * Created by marry on 8/1/15.
 */
public class Movie {
    private String movieId;
    private String name;
    private String year;
    private String director;
    private int rating;
    private String state;

    public Movie(String movieId,String name, String year, String director, int rating,String state) {
        this.movieId = movieId;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieId() {

        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return
                "movie id : '" + movieId + '\'' +
                ", name : '" + name + '\'' +
                ", year : '" + year + '\'' +
                ", director : '" + director + '\'' +
                ", rating : " + rating +
                '}';
    }
}
