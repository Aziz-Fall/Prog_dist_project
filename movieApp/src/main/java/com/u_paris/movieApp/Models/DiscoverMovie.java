package com.u_paris.movieApp.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;

/**
 * @bref DiscoverMovie class discorver movies by different
 * types of data like average rating, number of votes, genres
 * and certifications. The movie that are discovered represent
 * page and a page has a certain number of movies that are
 * stored in the list results.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscoverMovie implements Serializable {
    private int page;
    private List<Movie> results;
    private int total_pages;
    private int total_results;

    public DiscoverMovie(int page, List<Movie> results, int total_pages, int total_results) {
        this.page = page;
        this.results = results;
        this.total_pages = total_pages;
        this.total_results = total_results;
    }

    public DiscoverMovie() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    @Override
    public String toString() {
        return "DiscoverMovie{" +
                "page=" + page +
                ", results=" + results +
                ", total_pages=" + total_pages +
                ", total_results=" + total_results +
                '}';
    }
}
