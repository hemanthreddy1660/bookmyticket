package org.movie.moviebooking.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movieId;
    @Column(name = "title")
    private String title;
    @Column(name= "genre")
    private String genre;

    @Column(name = "duration")
    private String duration;

    @Column(name = "ratings")
    private String ratings;

    @Column(name = "descrip")
    private String descrip;
}
