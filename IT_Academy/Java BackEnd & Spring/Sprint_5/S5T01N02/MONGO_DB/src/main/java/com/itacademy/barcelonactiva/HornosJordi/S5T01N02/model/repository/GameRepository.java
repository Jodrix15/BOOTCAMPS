package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.repository;

import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain.Game;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {
    public List<Game> findByPlayer(Player player);
}
