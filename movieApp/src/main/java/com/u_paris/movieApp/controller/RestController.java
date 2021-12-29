package com.u_paris.movieApp.controller;

import com.u_paris.movieApp.Models.DiscoverMovie;
import com.u_paris.movieApp.Models.MovieGenre;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestController {
    @Value("${app.key}")
    private String mKey;

    @Value("${app.lang}")
    private String mLang;

    @GetMapping("/")
    public String home(Model model){

        String popular = "https://api.themoviedb.org/3/discover/movie?api_key=" +
                mKey +
                "&language=" +
                mLang +
                "&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_watch_monetization_types=flatrate";
        String action = "https://api.themoviedb.org/3/discover/movie?api_key=" +
                mKey +
                "&language=" +
                mLang +
                "&sort_by=popularity.desc&include_adult=false&include_video=false&page=2&with_watch_monetization_types=flatrate&with_genre=action";

        String fantasy = "https://api.themoviedb.org/3/discover/movie?api_key=" +
                mKey +
                "&language=" +
                mLang +
                "&sort_by=popularity.desc&include_adult=false&include_video=false&page=3&with_watch_monetization_types=flatrate&with_genre=fantasy";
        String comedy = "https://api.themoviedb.org/3/discover/movie?api_key=" +
                mKey +
                "&language=" +
                mLang +
                "&sort_by=popularity.desc&include_adult=false&include_video=false&page=3&with_watch_monetization_types=flatrate&with_genre=comedy";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<DiscoverMovie> page1 = restTemplate.getForEntity(popular, DiscoverMovie.class);
        ResponseEntity<DiscoverMovie> page2 = restTemplate.getForEntity(action, DiscoverMovie.class);
        ResponseEntity<DiscoverMovie> page3 = restTemplate.getForEntity(comedy, DiscoverMovie.class);
        ResponseEntity<DiscoverMovie> page4 = restTemplate.getForEntity(fantasy, DiscoverMovie.class);

        MovieGenre moviesGenre = new MovieGenre(page1.getBody().getResults().get(0), page1.getBody().getResults(), page2.getBody().getResults(), page3.getBody().getResults(), page4.getBody().getResults());
        model.addAttribute("moviesGenre", moviesGenre);
        return "home";
    }
}
