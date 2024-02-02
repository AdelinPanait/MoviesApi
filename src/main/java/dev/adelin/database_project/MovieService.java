package dev.adelin.database_project;

import java.util.List;
import java.util.Optional;




public interface MovieService {

    List<Movie>findallmovie();
    Optional<Movie> findbyid(Long imdbId);
    Movie savemovie(Movie movie);
    Movie updatemovie(Movie movie);
    void deletemovie(Long imdbId);

    
    
}
