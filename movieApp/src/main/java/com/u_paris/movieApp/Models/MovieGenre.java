package com.u_paris.movieApp.Models;

import java.util.List;

/**
 * @brief MovieGenre is a class that store a collection
 * of genres for movies like actions, comedies and
 * movies that are more popular.
 */
public class MovieGenre {
    private Movie defaultMovie;
    private List<Movie> populars;
    private List<Movie> actions;
    private List<Movie> comedies;
    private List<Movie> fantasies;

    public MovieGenre(Movie defaultMovie, List<Movie> populars, List<Movie> actions, List<Movie> comedies, List<Movie> fantasies) {
        this.defaultMovie = defaultMovie;
        this.populars = populars;
        this.actions = actions;
        this.comedies = comedies;
        this.fantasies = fantasies;
    }

    public Movie getDefaultMovie() {
        defaultMovie.setUrlImage("https://image.tmdb.org/t/p/w600" + defaultMovie.getBackdrop_path());
        return defaultMovie;
    }

    public void setDefaultMovie(Movie defaultMovie) {
        this.defaultMovie = defaultMovie;
    }

    public List<Movie> getActions() {
        return actions;
    }

    public void setActions(List<Movie> actions) {
        this.actions = actions;
    }

    public List<Movie> getComedies() {
        return comedies;
    }

    public void setComedies(List<Movie> comedies) {
        this.comedies = comedies;
    }

    public List<Movie> getFantasies() {
        return fantasies;
    }

    public void setFantasies(List<Movie> fantasies) {
        this.fantasies = fantasies;
    }

    public List<Movie> getPopulars() {
        return populars;
    }

    public void setPopulars(List<Movie> populars) {
        this.populars = populars;
    }
}
