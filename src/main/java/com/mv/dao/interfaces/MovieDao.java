package com.mv.dao.interfaces;

import com.mv.entity.Movie;
import com.mv.enums.Genre;
import com.mv.enums.MovieType;

import java.util.List;

/**
 *
 * Created by Eezo on 13.05.2016.
 */
public interface MovieDao extends GenericDao<Movie> {

    Movie findByName(String name);

    List<Movie> findAll();

    List<Movie> findByType(MovieType type);

    List<Movie> findByYear(int year);

    List<Movie> findByDirector(String director);

    List<Movie> findByActor(String actor);

    List<Movie> findByGenre(Genre genre);

    List<Movie> findByMusicBy(String musicBy);

    List<Movie> findByProducer(String producer);

    List<Movie> findByCreatedBy(String createdBy);

}
