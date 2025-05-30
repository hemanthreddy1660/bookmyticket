package org.movie.moviebooking.repositories;

import org.movie.moviebooking.entity.Theaters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theaters,Integer>{

}
