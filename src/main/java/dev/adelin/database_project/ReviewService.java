package dev.adelin.database_project;




import java.util.List;
import java.util.Optional;




public interface ReviewService {

  List<Review>findallreview();
    Optional<Review> findbyid(Long Id);
    Review savereview(Review review,Movie movie);
    Review updatereview(Review review);
    void deletereview(Long id);
   

    
   

}
