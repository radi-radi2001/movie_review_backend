package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.TvShow;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TvShowService {
    TvShow saveTvShow(TvShow tvShow);

    List<TvShow> allTvShows();
}
