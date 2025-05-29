package org.movie.moviebooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "seats")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "seats")
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private int seatId;

    @ManyToOne
    @JoinColumn(name="theater_id")
    private Theaters theaterId;

    @Column(name="seat_number")
    private String seatNumber;

    @Column(name="is_booked")
    private boolean isBooked;

}
