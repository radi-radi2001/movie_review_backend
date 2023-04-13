package com.example.SpringDemo.Services;

import com.example.SpringDemo.Services.EmployeeService;
import com.example.SpringDemo.pojos.Film;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeServiceImpl implements EmployeeService {
    public EntityManager entityManager;
    @Autowired
    public EmployeeServiceImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public List<Film> findAll() {
        TypedQuery<Film> typedQuery = entityManager.createQuery("from Film ",Film.class);
        return typedQuery.getResultList();
    }
    @Transactional
    @Override
    public Film saveFilm(Film film) {
        entityManager.persist(film);
        return film;
    }
}
