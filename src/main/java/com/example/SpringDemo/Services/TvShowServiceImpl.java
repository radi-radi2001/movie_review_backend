package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.TvShow;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TvShowServiceImpl implements TvShowService{

    public EntityManager entityManager;
    @Autowired
    public TvShowServiceImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public TvShow saveTvShow(TvShow tvShow) {
        entityManager.persist(tvShow);
        return tvShow;
    }
}
