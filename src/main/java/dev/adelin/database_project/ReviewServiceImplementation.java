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
public class ReviewServiceImplementation implements ReviewService{

    @Autowired
        private final ReviewRepository reviewRepository;


        @Override
        public List<Review> findallreview() {
            return reviewRepository.findAll();
        }

        @Override
        public Optional<Review> findbyid(Long Id) {
            if(Id!=null)
            return reviewRepository.findById(Id);
            return null;        
        }

        @Override
        public Review savereview(Review review,Movie movie) {
            if(review!=null && movie!=null){
                review.setMovie(movie);
           return reviewRepository.save(review);}
             return null;
        }

        @Override
        public Review updatereview(Review review) {
            if(review!=null)
            return reviewRepository.save(review);
            return null;
        }

        @Override
        
        public void deletereview(Long Id) {
            if(Id!=null)
           reviewRepository.deleteById(Id);
        }

    
}
