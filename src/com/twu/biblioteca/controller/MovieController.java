package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.entityDao.MovieDao;
import java.util.List;

/**
 * Created by marry on 8/2/15.
 */
public class MovieController {
    private MovieDao movieDao = new MovieDao();
    public List<Movie> getAllMovies(){
        return movieDao.getMovies();
    }
    public Movie setMovieLocked(List<Movie> movies,String choosenNumber){
        return movieDao.setMovieLocked(movies,choosenNumber);
    }
    public void setMovieLock(List<Movie> activeMovies, String choosenNumber){
        movieDao.setMovieLocked(activeMovies,choosenNumber);
    }
    public List<Movie> getLockedMovies (List<Movie> allMovies){
        return movieDao.getMovieLocked(allMovies);
    }
    public Movie setMovieActive (List<Movie> lockedMovies, String choosenNumber){
        return movieDao.setMovieActive(lockedMovies,choosenNumber);
    }
}
