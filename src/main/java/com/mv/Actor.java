package com.mv;

import main.java.com.mv.entity.Movie;
import main.java.com.mv.enums.Awards;
import main.java.com.mv.enums.Profession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class actor.
 * Created by Dimon on 20.04.2015.
 */
public class Actor {
    private Profession mainProfession = Profession.ACTOR;
    private List<Profession> professions;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private List<Movie> movieList;
    private List<Awards> awardsList;

    /**
     * Default constructor for John Smith.
     */
    public Actor(){
        this(null,"Джон","Смит",null,null,null,null);
        Adds.recordNoticeToConsole("John Smith was created.");
    }

    /**
     * Constructor with all parameters.
     * @param professions other professions
     * @param name actor first name
     * @param surname actor last name
     * @param dateOfBirth actor date of birth
     * @param dateOfDeath actor date of death
     * @param movieList actor movie list
     * @param awardsList actor award list
     */
    public Actor(List<Profession> professions, String name, String surname, Date dateOfBirth, Date dateOfDeath, List<Movie> movieList, List<Awards> awardsList) {
        setProfessions(professions);
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        setDateOfDeath(dateOfDeath);
        setMovieList(movieList);
        setAwardsList(awardsList);
    }

    /**
     * Constructor excluding other professions.
     * @param name actor first name
     * @param surname actor last name
     * @param dateOfBirth actor date of birth
     * @param dateOfDeath actor date of death
     * @param movieList actor movie list
     * @param awardsList actor award list
     */
    public Actor(String name, String surname, Date dateOfBirth, Date dateOfDeath, List<Movie> movieList, List<Awards> awardsList) {
        this(null, name, surname, dateOfBirth, dateOfDeath, movieList, awardsList);
    }

    /**
     * Constructor excluding other professions and date of death (he/she is still alive).
     * @param name actor first name
     * @param surname actor last name
     * @param dateOfBirth actor date of birth
     * @param movieList actor movie list
     * @param awardsList actor award list
     */
    public Actor(String name, String surname, Date dateOfBirth, List<Movie> movieList, List<Awards> awardsList) {
        this(null, name, surname, dateOfBirth, null, movieList, awardsList);
    }

    /**
     * Constructor excluding date of death (he/she is still alive).
     * @param professions other professions
     * @param name actor first name
     * @param surname actor last name
     * @param dateOfBirth actor date of birth
     * @param movieList actor movie list
     * @param awardsList actor award list
     */
    public Actor(List<Profession> professions, String name, String surname, Date dateOfBirth, List<Movie> movieList, List<Awards> awardsList) {
        this(professions, name, surname, dateOfBirth, null, movieList, awardsList);
    }

    public Profession getMainProfession() {
        return mainProfession;
    }

    public List<Profession> getProfessions() {
        return professions;
    }

    public void setProfessions(List<Profession> professions) {
        if (professions == null){
            this.professions = new ArrayList<>();
            return;
        }
        this.professions = professions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            this.name = "";
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
            return;
        }
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        if (dateOfBirth == null){
            this.dateOfBirth = new Date();
            return;
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDeath() {
        if (dateOfDeath == null) return null;
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        if (dateOfDeath == null){
            return;
        }
        this.dateOfDeath = dateOfDeath;
    }

    public int getAge() {
        if (dateOfDeath == null){
            return getAge(dateOfBirth,new Date());
        }
        return getAge(dateOfBirth,dateOfDeath);
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

    public int getAge(Date begin, Date end){
        long difference = Math.abs(begin.getTime()-end.getTime());
        long days = 1000*60*60*24;
        return (int)((difference/days)/365);
    }
}
