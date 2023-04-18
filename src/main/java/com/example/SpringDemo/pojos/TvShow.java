package com.example.SpringDemo.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Entity
@Table(name = "tvshow")
public class TvShow {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "tvshowId")
    private int tvShowId;

    @Column(name = "title")
    private String title;

    @Column(name = "releasedate")
    private Date date;

    @Column(name = "rated")
    private String rated;

    @Column(name = "seasons")
    private int seasons;

    @Column(name = "genre")
    private String genre;

    @Column(name = "directors")
    private String directors;

    @Column(name = "writers")
    private String writers;

    @Column(name = "actors")
    private String actors;

    @Column(name = "plot")
    private String plot;

    @Column(name = "language")
    private String language;

    @Column(name = "poster")
    private String poster;

    @Column(name = "tmdb_id")
    private int TMDB_id;

    @JsonIgnore
    @OneToOne(mappedBy = "tvShow")
    private Review review;

    public TvShow(String title, Date date, String rated, int seasons, String genre, String directors, String writers, String actors, String plot, String language, String poster, int tmdb_id, Review review) {
        this.title = title;
        this.date = date;
        this.rated = rated;
        this.seasons = seasons;
        this.genre = genre;
        this.directors = directors;
        this.writers = writers;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.poster = poster;
        TMDB_id = tmdb_id;
        this.review = review;
    }

    public TvShow() {

    }

    public int geTvShowId() {
        return tvShowId;
    }

    public void setTvShowId(int tvShowId) {
        this.tvShowId = tvShowId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public int getTMDB_id() { return TMDB_id; }

    public void setTMDB_id(int tmdb_id) { TMDB_id = tmdb_id; }
}
