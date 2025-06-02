package org.movie.moviebooking.repositories;

import org.movie.moviebooking.entity.Movies;
import org.movie.moviebooking.entity.Showtimes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowTimeRepository extends JpaRepository<Showtimes,Integer> {
    List<Showtimes> findByMovieId(Movies movie);
}
