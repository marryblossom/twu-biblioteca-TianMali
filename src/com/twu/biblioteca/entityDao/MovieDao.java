package com.twu.biblioteca.entityDao;

import com.twu.biblioteca.entity.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marry on 8/1/15.
 */
public class MovieDao {
    private List<Movie> movies = new ArrayList<Movie>();
    Movie movie;
    public List<Movie> getMovies(){
        movie = new Movie("1","Fast & Furious","2001","Rob Korn",7,"active");
        movies.add(movie);
        movie = new Movie("2","Transformers","2007","Michael Bay",10,"active");
        movies.add(movie);
        movie = new Movie("3","H","2008","Louis Leterrier",8,"active");
        movies.add(movie);
        movie = new Movie("4","Superman","1978","Richard Donner",7,"active");
        movies.add(movie);
        movie = new Movie("5","Batman","1989","Tim Burton",10,"active");
        movies.add(movie);
        return movies;
    }

    public Movie setMovieLocked(List<Movie> allMovies, String choosenNumber){
        for(Movie movie:allMovies){
            if (movie.getMovieId().equals(choosenNumber)){
                movie.setState("locked");
                return movie;
            }
        }
        return null;
    }


    public Movie getMovieById(List<Movie> movies ,String id){
        for (Movie movie:movies){
            if (id.equals(movie.getMovieId())){
                return movie;
            }
        }
        return null;
    }
    public List<Movie> getMovieActive(List<Movie> allMovies){
        List<Movie> movieList = new ArrayList<Movie>();
        for (Movie movie:allMovies){
            if (movie.getState().equals("active")){
                movieList.add(movie);
            }
        }
        return movieList;
    }

    public List<Movie> getMovieLocked(List<Movie> allMovies){
        List<Movie> movieList = new ArrayList<Movie>();
        for (Movie movie:allMovies){
            if (movie.getState().equals("locked")){
                movieList.add(movie);
            }
        }
        return movieList;
    }
    public Movie setMovieActive(List<Movie> lockedMovies, String choosenNumber){
        for (int i = 0; i < lockedMovies.size(); i++) {
            if (lockedMovies.get(i).getMovieId().equals(choosenNumber)){
                lockedMovies.get(i).setState("active");
                return lockedMovies.get(i);
            }
        }
        return null;
    }
}
