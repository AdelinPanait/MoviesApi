package dev.adelin.database_project;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
     @GetMapping("/get")
    public List<Review> findallreview()
    {
        return reviewService.findallreview();
    }
    @GetMapping("/{Id}")
    public Optional<Review> findbyid(@PathVariable("Id") Long id)
    {
        return reviewService.findbyid(id);
    }

    @PostMapping("/add")
    public Review savReview(@RequestBody Review review)
    {
        return reviewService.savereview(review);
    }

    
    @PutMapping("/update")
    public Review updateReview(@RequestBody Review review)
    {
        return reviewService.updatereview(review);
    }

    @DeleteMapping("/{Id}")
    public void deletereview(@PathVariable("Id") Long id)
    {
         reviewService.deletereview(id);
    }
    
   
    
}
