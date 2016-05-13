package com.mv;

import main.java.com.mv.entity.Movie;
import main.java.com.mv.enums.Awards;
import main.java.com.mv.enums.Profession;

import java.util.ArrayList;
import java.util.List;

/**
 * Class director.
 * Created by Dimon on 20.04.2015.
 */
public class Director {
    private Profession profession = Profession.DIRECTOR;
    private String name;
    private String surname;
    private List<Movie> movieList;
    private List<Awards> awardsList;

    /**
     * Default constructor for Alan Smithee.
     */
    public Director(){
        this("Алан","Смити",null,null);
        Adds.recordNoticeToConsole("Alan Smithee was created.");
    }

    /**
     * Main constructor.
     * @param name director first name
     * @param surname director last name
     * @param movieList director movie list
     * @param awardsList director awards list
     */
    public Director(String name, String surname, List<Movie> movieList, List<Awards> awardsList) {
        setName(name);
        setSurname(surname);
        setMovieList(movieList);
        setAwardsList(awardsList);
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            this.name = "";
            Adds.recordNoticeToConsole("Empty name was assigned to "+surname);
            return;
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null){
            this.surname = "";
            Adds.recordNoticeToConsole("Empty surname was assigned to "+name);
            return;
        }
        this.surname = surname;
    }

    public int getMovieNumber() {
        if (movieList == null){
            return 0;
        }
        return movieList.size();
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        if (movieList == null){
            this.movieList = new ArrayList<>();
            return;
        }
        this.movieList = movieList;
    }

    public List<Awards> getAwardsList() {
        return awardsList;
    }

    public void setAwardsList(List<Awards> awardsList) {
        if (awardsList == null){
            this.awardsList = new ArrayList<>();
            return;
        }
        this.awardsList = awardsList;
    }
}
