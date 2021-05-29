/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.rating.system;

import java.util.ArrayList;

/**
 *
 * @author bilal
 */
public class Movie {
    private String movieName;
    private int year;
    private String director;
    private int likes;
    private String[] genre;
    private String summary;
    private static Movie movie = null;

    protected Movie(String movieName, int year, String director, int likes, String[] genre, String summary) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.likes = likes;
        this.genre = genre;
        this.summary = summary;
    }
    
    public Movie createMovie(String movieName, int year, String director, int likes, String[] genre, String summary){
        if(movie == null){
            movie = new Movie(movieName,year,director,likes,genre,summary);
        }else{
            setMovieName(movieName);
            setYear(year);
            setDirector(director);
            setLikes(likes);
            setGenre(genre);
            setSummary(summary);
        }
        return movie;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    
    
}
