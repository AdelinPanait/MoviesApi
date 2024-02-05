package dev.adelin.database_project;

import java.util.List;



import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movies")
public class Movie {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private  String poster;


    @ElementCollection
    @CollectionTable(name = "movie_genres", joinColumns = @JoinColumn(name = "imdbId"))
    @Column(name = "genre")
    private List<String> genres;

    @ElementCollection
    @CollectionTable(name = "movie_backdrops", joinColumns = @JoinColumn(name = "imdbId"))
    @Column(name = "backdrop")
    private List<String> backdrops;
    
    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;
   

    
}
