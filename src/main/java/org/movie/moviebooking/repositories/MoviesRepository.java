package org.movie.moviebooking.repositories;

import org.movie.moviebooking.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies,Integer>{
}
