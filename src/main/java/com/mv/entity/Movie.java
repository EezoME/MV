package com.mv.entity;

import com.mv.Adds;
import com.mv.enums.MovieType;

import javax.persistence.*;
import java.io.Serializable;
import java.net.URL;

/**
 * Class movie.
 * Created by Eezo on 20.04.2015.
 */

@Entity
@Table(name = "Movie")
@NamedQuery(name = "Movie.getAll", query = "SELECT title from Movie movies")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movieId")
    private int movieId;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "director")
    private String director;

    @Column(name = "cast")
    private String cast;

    @Column(name = "genre")
    private String genres;

    @Column(name = "music_by")
    private String musicBy;

    @Column(name = "producer")
    private String producers;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "running_time")
    private int runningTime;

    @Column(name = "rating_imdb")
    private double imdbRating;

    @Column(name = "link")
    private URL link;


    public int getMovieId() {
        return movieId;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType type) {
        if (type == null) {
            this.type = MovieType.FILM;
            return;
        }
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            this.title = "";
            return;
        }
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getMusicBy() {
        return musicBy;
    }

    public void setMusicBy(String musicBy) {
        this.musicBy = musicBy;
    }

    public String getProducers() {
        return producers;
    }

    public void setProducers(String producers) {
        this.producers = producers;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public String getStringRunningTime() {
        return (runningTime / 60) + ":" + runningTime % 60;
    }

    public void setRunningTime(int runningTime) {
        if (runningTime < 0) {
            this.runningTime = 0;
            Adds.recordNoticeToConsole("Runtime was reduced to 0.");
            return;
        }
        this.runningTime = runningTime;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        if (imdbRating < 0) {
            this.imdbRating = 0;
            Adds.recordNoticeToConsole("Rating was reduced to 0.");
            return;
        }
        if (imdbRating > 10) {
            this.imdbRating = 10;
            Adds.recordNoticeToConsole("Rating was reduced to 10.");
            return;
        }
        this.imdbRating = imdbRating;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }
}
