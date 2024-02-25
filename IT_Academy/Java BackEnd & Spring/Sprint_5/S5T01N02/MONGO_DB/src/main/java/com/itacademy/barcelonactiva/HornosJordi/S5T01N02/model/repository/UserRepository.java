package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.repository;

import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}