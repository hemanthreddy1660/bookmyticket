package org.movie.moviebooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "theaters")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Theaters{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theater_id")
    private int theaterId;

    @Column(name = "theatername")
    private String theaterName;

    @Column(name = "location")
    private String location;

    @Column(name = "total_seats")
    private int totalSeats;
}
