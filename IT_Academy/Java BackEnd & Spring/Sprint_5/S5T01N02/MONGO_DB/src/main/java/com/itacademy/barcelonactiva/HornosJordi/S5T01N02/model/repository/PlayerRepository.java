package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.repository;

import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain.Player;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PlayerRepository extends MongoRepository<Player, String> {
    Player findByUsername(String username);

}
