package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain;

import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "games")
public class Game {

    @Id
    private String id;

    private Player player;

    private int dice1;
    private int dice2;
    private LocalDateTime playedTime;

    public Game(Player player, int dice1, int dice2){
        this.player = player;
        this.dice1 = dice1;
        this.dice2 = dice2;
    }
}
