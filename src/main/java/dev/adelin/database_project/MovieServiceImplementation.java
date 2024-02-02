package dev.adelin.database_project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;


@Service
@Data
@AllArgsConstructor

public class MovieServiceImplementation implements MovieService {

        @Autowired
        private final MovieRepository movieRepository;

        @Override
        public List<Movie> findallmovie() {
            return movieRepository.findAll();
        }

        @Override
        public Optional<Movie> findbyid(Long imdbId) {
            if(imdbId!=null)
            return movieRepository.findById(imdbId);
            return null;
                                  
        }

        @Override
        public Movie savemovie(Movie movie) {
            if(movie!=null)
           return movieRepository.save(movie);
           return null;
        }

        @Override
        public Movie updatemovie(Movie movie) {
            if(movie!=null)
            return movieRepository.save(movie);
            return null;
        }

        @Override
        
        public void deletemovie(Long imdbId) {
            if(imdbId!=null)
           movieRepository.deleteById(imdbId);
           
            
        }


         
    
}
