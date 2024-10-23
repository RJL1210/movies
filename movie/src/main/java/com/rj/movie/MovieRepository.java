package com.rj.movie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
