package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.services;

import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain.Player;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto.GameDTO;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto.PlayerDTO;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto.request.PlayerDTORequest;

import java.util.List;

public interface PlayerService {

    public List<PlayerDTO> getAllPlayersDTO();
    public Player getPlayer(String id);
    public List<Player> getAllPlayers();
    public GameDTO playGame(String id);
    public List<GameDTO> getAllGames(String id);
    public void deleteAllGames(String id);
    public List<PlayerDTO> getWinRates();
    public double getAVGWinRates();
    public PlayerDTO getWinner();
    public PlayerDTO getLoser();
    public PlayerDTO player2DTO(Player player);
    public void updatePlayer(String id, PlayerDTORequest player);
    public void addPlayer(PlayerDTORequest player);
    public Player DTO2Player(PlayerDTORequest player);
    
}
