package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class PlayerDTO {


    private String username;
    private Double winRate;

    public PlayerDTO(String username, Double winRate){
        this.username = Objects.requireNonNull(username, "UNKNOWN");
        this.winRate = winRate;
    }
}
