package org.movie.moviebooking.service;

import org.movie.moviebooking.dto.ShowtimeRequest;
import org.movie.moviebooking.entity.Movies;
import org.movie.moviebooking.entity.Showtimes;
import org.movie.moviebooking.entity.Theaters;
import org.movie.moviebooking.repositories.MoviesRepository;
import org.movie.moviebooking.repositories.ShowTimeRepository;
import org.movie.moviebooking.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowTimeService {
    @Autowired
    private MoviesRepository moviesRepository;
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private ShowTimeRepository showTimeRepository;
    public List<Showtimes> findAllShowTimesByMovieId(Integer movieId) {
        Optional<Movies> movies = moviesRepository.findById(movieId);
        if(movies.isPresent()) {
            return showTimeRepository.findByMovieId(movies.get());
        }
        else{
            throw new RuntimeException("Movie not found");
        }
    }

}
