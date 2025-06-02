package org.movie.moviebooking.controllers;

import org.movie.moviebooking.entity.Seats;
import org.movie.moviebooking.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;
    @GetMapping("/{id}/seats")
    public List<Seats> getSeats(@PathVariable Integer id) {
        return seatService.findSeatsByTheaterId(id);
    }
}
