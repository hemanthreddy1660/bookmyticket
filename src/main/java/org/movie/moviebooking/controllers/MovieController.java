package org.movie.moviebooking.controllers;

import org.movie.moviebooking.entity.Movies;
import org.movie.moviebooking.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController{
    @Autowired
    private MoviesService moviesService;
    @GetMapping("/allmovies")
    public List<Movies> getAllMovies(){
        return moviesService.getAllMovies();
    }
    @GetMapping("/{id}/movie")
    public ResponseEntity<Movies> getMovieById(@PathVariable Integer id){
        try{
            return new ResponseEntity<>(moviesService.getMovieById(id), HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/addmovie")
    public ResponseEntity<Movies> addMovie(@RequestBody Movies movie){
        try {
            return new ResponseEntity<>(moviesService.addMovie(movie), HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/{id}/update")
    public Movies updateMovie(@PathVariable Integer id, @RequestBody Movies movie){
        return moviesService.updateMovie(id, movie);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Movies> deleteMovie(@PathVariable Integer id){
        return new ResponseEntity<>(moviesService.deleteMovie(id),HttpStatus.OK);
    }
}
