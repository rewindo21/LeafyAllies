package com.rewindo.LeafyAllies.users;

import com.rewindo.LeafyAllies.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findByEmail(String email);
    // Implementing a method to search movies by email instead of _id
}
