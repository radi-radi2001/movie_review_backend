package com.example.SpringDemo.controller;

import com.example.SpringDemo.Services.FilmService;
import com.example.SpringDemo.Services.EpisodeService;
import com.example.SpringDemo.Services.FilmService;
import com.example.SpringDemo.Services.ReviewInterface;
import com.example.SpringDemo.Services.TvShowService;
import com.example.SpringDemo.pojos.Episode;
import com.example.SpringDemo.pojos.Film;
import com.example.SpringDemo.pojos.Review;
import com.example.SpringDemo.pojos.TvShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class DemoController {
    public FilmService filmService;
    public ReviewInterface reviewInterface;
    public TvShowService tvShowService;
    public EpisodeService episodeService;
    @Autowired
    public DemoController(FilmService filmService, ReviewInterface reviewInterface, TvShowService tvShowService, EpisodeService episodeService){
        this.filmService = filmService;
        this.reviewInterface = reviewInterface;
        this.tvShowService = tvShowService;
        this.episodeService = episodeService;
    }

    @GetMapping("/films")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Film> allMovies(){
        return filmService.findAll();
    }

    @GetMapping("/reviews")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Review> allReviews(){
        return reviewInterface.allReviews();
    }

    @PostMapping("/review")
    @CrossOrigin(origins = "http://localhost:3000")
    public Review saveReview(@RequestBody  Review review){
        reviewInterface.saveReview(review);
        return review;
    }

    @PostMapping("/film")
    @CrossOrigin(origins = "http://localhost:3000")
    public Film saveFilm(@RequestBody Film film){
        filmService.saveFilm(film);
        return film;
    }

    @PostMapping("/tvshow")
    @CrossOrigin(origins = "http://localhost:3000")
    public TvShow saveTvShow(@RequestBody TvShow tvShow){
        tvShowService.saveTvShow(tvShow);
        return tvShow;
    }

    @PostMapping("/episodes")
    @CrossOrigin(origins = "http://localhost:3000")
    public void saveEpisodes(@RequestBody List<Episode> list){
        List<Episode> episodeList = new ArrayList<>(list);
        episodeList.addAll(list);
        episodeService.saveAll(episodeList);
    }

    @GetMapping("/tvshows")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<TvShow> allShows (){
        return tvShowService.allTvShows();
    }

}
