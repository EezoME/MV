package com.mv.service;

import com.mv.entity.Movie;
import com.mv.exceptions.InvalidMovieException;
import com.mv.exceptions.MovieNotFoundException;
import com.mv.service.interfaces.MovieService;
import com.mv.dao.interfaces.MovieDao;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by Eezo on 13.05.2016.
 */
@Stateless
public class MovieServiceBean extends AbstractService<Movie> implements MovieService {

    private MovieDao movieDao;

    @EJB
    public void setMovieDao(MovieDao movieDao){
        this.movieDao = movieDao;
    }

    @Override
    public void addMovie(Movie movie) throws InvalidMovieException {
        validateEntity(movie);
        movieDao.persist(movie);
    }

    @Override
    public void removeMovie(int movieId) {
        movieDao.remove(movieId);
    }

    @Override
    public void updateMovie(Movie movie) throws InvalidMovieException {
        String s = validateEntity(movie);
        if (s != null){
            throw new InvalidMovieException(s);
        }
        movieDao.persist(movie);
    }

    @Override
    public Movie findMovie(int id) throws MovieNotFoundException {
        Movie movie = movieDao.find(id);
        if (movie == null){
            throw new MovieNotFoundException("Movie with id"+id+"was mot found");
        }
        return movie;
    }

    @Override
    public Movie findMovie(String title) throws MovieNotFoundException {
        Movie movie = movieDao.find(title);
        if (movie == null){
            throw new MovieNotFoundException("Movie with title " + title + "was mot found");
        }
        return movie;
    }
}
