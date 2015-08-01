package com.twu.biblioteca.entityDao;

import com.twu.biblioteca.entity.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by marry on 8/1/15.
 */
public class MovieDaoTest {
private MovieDao movieDao;
    private List<Movie> movies;
    @Before
    public void setUp() throws Exception {
        movieDao = new MovieDao();
        movies = movieDao.getMovies();
    }

    @Test
    public void testGetMovies() throws Exception {
        assertEquals(5,movieDao.getMovies().size());
    }

    @Test
    public void testSetMovieLocked() throws Exception {
        assertNotNull(movieDao.setMovieLocked(movies,"1"));

    }

    @Test
    public void testGetMovieById() throws Exception {
        assertNotNull(movieDao.getMovieById(movies,"1"));
    }

    @Test
    public void testGetMovieActive() throws Exception {
        assertEquals(5,movieDao.getMovieActive(movies).size());
    }

    @Test
    public void testGetMovieLocked() throws Exception {
        movies.get(0).setState("locked");
        movies.get(1).setState("locked");
        assertEquals(2,movieDao.getMovieLocked(movies).size());
    }

    @Test
    public void testSetMovieActive() throws Exception {
        movies.get(0).setState("locked");
        assertNotNull(movieDao.setMovieActive(movies,"1"));

    }
}