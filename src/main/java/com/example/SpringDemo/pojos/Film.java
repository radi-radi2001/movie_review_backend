package com.example.SpringDemo.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;


@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int filmId;
    @Column(name = "Title")
    private String Title;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    @Column(name = "Released")
    private String Released;

    @Column(name = "rated")
    private char rate;

    @Column(name = "runtime")
    private int Runtime;

    @Column(name = "genre")
    private String Genre;

    @Column(name = "director")
    private String Director;

    @Column(name = "writer")
    private String Writer;

    @Column(name = "actoers")
    private String Actors;

    @Column(name = "plot")
    private String Plot;

    @Column(name = "language")
    private String Language;

    @Column(name = "poster")
    private String Poster;


    @Column(name = "awards")
    private String Awards;

    @OneToOne(mappedBy = "film")
    private Review review;

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Film(){

    }
    public Film(int filmId, String Title, String released, char rate, int runtime, String genre, String director, String writer, String actors, String plot, String language, String poster, String awards, Review review) {
        this.filmId = filmId;
        this.Title = Title;
        Released = released;
        this.rate = rate;
        Runtime = runtime;
        Genre = genre;
        Director = director;
        Writer = writer;
        Actors = actors;
        Plot = plot;
        Language = language;
        Poster = poster;
        Awards = awards;
        this.review = review;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReleased() {
        return Released;
    }

    public void setReleased(String released) {
        Released = released;
    }

    public char getRate() {
        return rate;
    }

    public void setRate(char rate) {
        this.rate = rate;
    }

    public int getRuntime() {
        return Runtime;
    }

    public void setRuntime(int runtime) {
        Runtime = runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getAwards() {
        return Awards;
    }

    public void setAwards(String awards) {
        Awards = awards;
    }
}
