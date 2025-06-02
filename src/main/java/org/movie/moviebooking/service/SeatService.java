package org.movie.moviebooking.service;

import org.movie.moviebooking.entity.Seats;
import org.movie.moviebooking.entity.Theaters;
import org.movie.moviebooking.repositories.SeatRepository;
import org.movie.moviebooking.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private TheatreRepository theatreRepository;
    public List<Seats> findSeatsByTheaterId(Integer theaterId) {
        Optional<Theaters> result = theatreRepository.findById(theaterId);
        if(result.isPresent()){
            return seatRepository.findByTheaterId(result.get());
        }else{
            throw new RuntimeException("There is no such theater");
        }
    }
}
