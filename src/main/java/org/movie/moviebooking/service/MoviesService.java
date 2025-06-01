package org.movie.moviebooking.service;

import org.movie.moviebooking.entity.Movies;
import org.movie.moviebooking.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }
    public Movies getMovieById(Integer id) {
        Optional<Movies> movie = moviesRepository.findById(id);
        if(movie.isPresent()) {
            return movie.get();
        }
        else{
            throw new RuntimeException("Movie not found with id: " + id);
        }
    }
    public Movies addMovie(Movies movie){
        return moviesRepository.save(movie);
    }
    public Movies updateMovie(Integer id,Movies movie){
        Movies existingMovie =getMovieById(id);
        existingMovie.setTitle(movie.getTitle() != null ? movie.getTitle() : existingMovie.getTitle());
        existingMovie.setGenre(movie.getGenre() != null ? movie.getGenre() : existingMovie.getGenre());
        existingMovie.setDuration(movie.getDuration() != null ? movie.getDuration() : existingMovie.getDuration());
        existingMovie.setRatings(movie.getRatings() != null ? movie.getRatings() : existingMovie.getRatings());
        existingMovie.setDescrip(movie.getDescrip() != null ? movie.getDescrip() : existingMovie.getDescrip());
        return moviesRepository.save(existingMovie);
    }
    public Movies deleteMovie(Integer id) {
        Optional<Movies> movie = moviesRepository.findById(id);
        if(movie.isPresent()) {
            moviesRepository.delete(movie.get());
        }else{
            throw new RuntimeException("Movie not found with id: " + id);
        }
        return movie.get();
    }
}
