package dev.adelin.database_project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/movies")

public class MovieController {
    @Autowired
    private final MovieService movieService;
    @GetMapping("/get")
    public List<Movie> findallmovie()
    {
        return movieService.findallmovie();
    }
    @GetMapping("/{id}")
    public Optional<Movie> findbyid(@PathVariable("id") Long id)
    {
        return movieService.findbyid(id);
    }

    @PostMapping("/add")
    public Movie saveMovie(@RequestBody Movie movie)
    {
        return movieService.savemovie(movie);
    }

    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie)
    {
        return movieService.updatemovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deletemovie(@PathVariable("id") Long id)
    {
         movieService.deletemovie(id);
    }
    
}
