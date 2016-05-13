package com.mv.service.interfaces;

import com.mv.entity.Movie;
import com.mv.exceptions.InvalidMovieException;
import com.mv.exceptions.MovieNotFoundException;

/**
 *
 * Created by Eezo on 13.05.2016.
 */
public interface MovieService {

    void addMovie(Movie movie) throws InvalidMovieException;

    void removeMovie(int movieId);

    void updateMovie(Movie movie) throws InvalidMovieException;

    Movie findMovie(int id) throws MovieNotFoundException;

    Movie findMovie(String title) throws MovieNotFoundException;

}
