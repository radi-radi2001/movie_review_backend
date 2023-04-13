package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.Review;

import java.util.List;

public interface ReviewInterface {
    List<Review> allReviews();

    Review saveReview(Review review);

}
