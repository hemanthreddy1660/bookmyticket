package org.movie.moviebooking.repositories;

import org.movie.moviebooking.entity.Seats;
import org.movie.moviebooking.entity.Theaters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seats,Integer> {
    List<Seats> findByTheaterId(Theaters theaterId);
}
