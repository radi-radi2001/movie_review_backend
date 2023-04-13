package com.example.SpringDemo.pojos;

import jakarta.persistence.*;

@Entity
@Table(name = "episode")
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "episodeid")
    private int id;

    @Column(name = "titleepisode")
    private String Title;

    @Column(name = "releasedateepisode")
    private String released;

    @Column(name = "episodenumber")
    private int Episode;

    public Episode(String Title, String released, int Episode) {
        this.Title = Title;
        this.released = released;
        this.Episode = Episode;
    }

    public Episode() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReleased() {
        return released;
    }

    public void setRelease(String released) {
        this.released = released;
    }

    public int getEpisode() {
        return Episode;
    }

    public void setEpisode(int episode) {
        Episode = episode;
    }
}
