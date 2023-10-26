package com.rewindo.LeafyAllies.movies;

import com.rewindo.LeafyAllies.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findByImdbId(String imdbId);
    // Implementing a method to search movies by imdbId instead of _id
}


