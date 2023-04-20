package com.example.SpringDemo.pojos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int Id;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private float Rating;

    @Column(name = "type")
    private String Type;

    @Column(name = "descriptionn")
    private String Description;

    @Column(name = "spoiler")
    private Boolean Spoiler;

    @Column(name = "date")
    private String Date;

    @Column(name = "name")
    private String Name;

    @Column(name = "username")
    private String Username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    private Film film;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tvshow_id", referencedColumnName = "tvshowId")
    private TvShow tvShow;

    public Review() {

    }

    public Review(String title, float rating, String type, String description, Boolean spoiler, String date, String name, String username, Film film,TvShow tvShow) {
        this.title = title;
        Rating = rating;
        Type = type;
        Description = description;
        Spoiler = spoiler;
        Date = date;
        Name = name;
        Username = username;
        this.film = film;
        this.tvShow = tvShow;
    }

    public TvShow getTvShow() {
        return tvShow;
    }

    public void setTvShow(TvShow tvShow) {
        this.tvShow = tvShow;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Boolean getSpoiler() {
        return Spoiler;
    }

    public void setSpoiler(Boolean spoiler) { Spoiler = spoiler; }

    public String getDate() { return Date; }

    public void setDate(String date) { Date = date; }

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    public String getUsername() { return Username; }

    public void setUsername(String username) { Username = username; }
}
