package com.rewindo.LeafyAllies.reviews;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class Review {
    @Id
    private ObjectId _id;
    private String body;
    private LocalDateTime created;

    public Review(String body, LocalDateTime created) {
        this.body = body;
        this.created = created;
    }
}
