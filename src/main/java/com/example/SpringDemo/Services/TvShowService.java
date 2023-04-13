package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.TvShow;
import org.springframework.stereotype.Repository;

@Repository
public interface TvShowService {
    TvShow saveTvShow(TvShow tvShow);
}
