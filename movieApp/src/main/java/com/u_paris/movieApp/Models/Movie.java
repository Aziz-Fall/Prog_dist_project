package com.u_paris.movieApp.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

/**
 * @bref Get the primary information about a movie like
 * vote average, id movie, vote account, overview ...
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable {

    private Boolean adult;
    private String backdrop_path;
    private int id;
    private String original_language;
    private String original_title;
    private String overview;
    private Long popularity;
    private String poster_path;
    private String release_date;
    private String title;
    private String vote_average;
    private String vote_count;
    private String urlImage;
    private String subsOverview;
    private String details;


    public Movie(Boolean adult, String backdrop_path, int id, String original_language, String original_title, String overview, Long popularity, String poster_path, String release_date, String title, String vote_average, String vote_count) {
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.id = id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.title = title;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    public Movie() {
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Long getPopularity() {
        return popularity;
    }

    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getVote_count() {
        return vote_count;
    }

    public String getSubsOverview(){
        if(overview.length() >= 50 ){
            subsOverview = overview.substring(0, 50);
        } else{
            subsOverview = overview.substring(0, 30);

        }

        return  subsOverview + "...";
    }

    public void setVote_count(String vote_count) {
        this.vote_count = vote_count;
    }

    public String getUrlImage(){
        this.urlImage = "https://image.tmdb.org/t/p/w500" + this.backdrop_path;
        return urlImage;
    }

    public String getDetails() {
        this.details = "https://www.themoviedb.org/movie/" + this.id;
        return details;
    }

    public void setSubsOverview(String subsOverview){
        this.subsOverview = subsOverview;
    }

    public void setDetails(String details){

        this.details = details;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "adult=" + adult +
                ", backdrop_path='" + backdrop_path + '\'' +
                ", id=" + id +
                ", original_language='" + original_language + '\'' +
                ", original_title='" + original_title + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", poster_path='" + poster_path + '\'' +
                ", release_date='" + release_date + '\'' +
                ", title='" + title + '\'' +
                ", vote_average='" + vote_average + '\'' +
                ", vote_count='" + vote_count + '\'' +
                '}';
    }
}
