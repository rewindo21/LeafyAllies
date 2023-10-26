package com.rewindo.LeafyAllies.movies;

import com.rewindo.LeafyAllies.movies.Movie;
import com.rewindo.LeafyAllies.movies.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
