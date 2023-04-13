package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.Film;
import org.springframework.stereotype.Service;

import java.util.List;
public interface EmployeeService {
    List<Film> findAll();

    Film saveFilm(Film film);
}
