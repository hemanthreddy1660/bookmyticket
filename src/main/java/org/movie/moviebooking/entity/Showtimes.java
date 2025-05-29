package org.movie.moviebooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "showtimes")
public class Showtimes {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    @Column(name = "showtime_id")
    private int showtimeId;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movieId;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theaters theaterId;

    @Column(name = "show_date")
    private LocalDate showDate;

    @Column(name = "show_time")
    private LocalTime showTime;

}
