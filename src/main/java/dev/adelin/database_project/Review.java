package dev.adelin.database_project;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reviews")

public class Review {
        @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private float score;
    private String body;

    @ManyToOne
    @JsonIgnore
    private Movie movie;
    
}
