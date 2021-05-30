/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.rating.system;


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

    protected Movie() {

    }

    @Override
    public String toString() {
        return "Movie{" + "movieName=" + movieName + ", year=" + year + ", director=" + director + ", likes=" + likes + ", genre=" + genre + ", summary=" + summary + '}';
    }
    
    public static Movie createMovie(){
        if(movie == null){
            movie = new Movie();
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
