package org.movie.moviebooking.controllers;

import org.movie.moviebooking.entity.Theaters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.movie.moviebooking.service.TheatreService;

import java.util.List;
@RestController
@RequestMapping("/api/theater")
public class TheatreController {
    @Autowired
    private TheatreService theatreService;
    @GetMapping("/alltheaters")
    public List<Theaters> getAllTheaters() {
        return theatreService.getallTheaters();
    }
    @PostMapping("/addTheater")
    public void addTheater(@RequestBody Theaters theater) {
         theatreService.addTheatre(theater);
    }
}
