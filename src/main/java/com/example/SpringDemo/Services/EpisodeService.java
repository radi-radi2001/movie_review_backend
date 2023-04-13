package com.example.SpringDemo.Services;

import com.example.SpringDemo.pojos.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeService extends JpaRepository<Episode,Integer> {
}
