package org.movie.moviebooking.controllers;

import org.movie.moviebooking.entity.Theaters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.movie.moviebooking.service.TheatreService;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TheatreController {
    @Autowired
    private TheatreService theatreService;
    @GetMapping("/alltheaters")
    public List<Theaters> getAllTheaters() {
        return theatreService.getallTheaters();
    }
}
