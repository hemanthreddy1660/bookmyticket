package org.movie.moviebooking.service;
import org.movie.moviebooking.entity.Theaters;
import org.movie.moviebooking.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;
    public List<Theaters> getallTheaters() {
        return theatreRepository.findAll();
    }
    public ResponseEntity<Theaters> addTheatre(Theaters theater) {
        try{
            theatreRepository.save(theater);
            return new ResponseEntity<>(theater, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
