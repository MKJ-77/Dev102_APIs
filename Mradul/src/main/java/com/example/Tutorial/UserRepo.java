package com.example.Tutorial;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
}
