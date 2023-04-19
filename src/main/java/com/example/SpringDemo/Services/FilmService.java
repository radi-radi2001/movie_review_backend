package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.Film;
import org.springframework.stereotype.Service;

import java.util.List;
public interface FilmService {
    List<Film> findAll();

    Film saveFilm(Film film);
}
