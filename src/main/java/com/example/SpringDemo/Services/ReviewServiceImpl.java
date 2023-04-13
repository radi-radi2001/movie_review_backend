package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.Film;
import com.example.SpringDemo.pojos.Review;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Repository
public class ReviewServiceImpl implements ReviewInterface{
    public EntityManager entityManager;
    @Autowired
    public ReviewServiceImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public List<Review> allReviews() {
        TypedQuery<Review> fromReview = entityManager.createQuery("from Review", Review.class);
        return fromReview.getResultList();
    }

    @Override
    @Transactional
    public Review saveReview(Review review) {
        entityManager.persist(review);
        return review;
    }
}
