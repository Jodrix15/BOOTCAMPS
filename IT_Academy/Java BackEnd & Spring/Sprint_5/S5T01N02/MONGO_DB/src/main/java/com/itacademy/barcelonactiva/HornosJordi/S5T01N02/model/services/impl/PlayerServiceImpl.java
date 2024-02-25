package com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.services.impl;

import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.exception.GameNotFoundException;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.exception.PlayerNotFoundException;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.exception.UsernameInUsedException;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.domain.Player;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto.GameDTO;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto.PlayerDTO;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.dto.request.PlayerDTORequest;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.repository.PlayerRepository;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.services.GameServices;
import com.itacademy.barcelonactiva.HornosJordi.S5T01N02.model.services.PlayerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;
    private GameServices gameServices;

    public PlayerServiceImpl(PlayerRepository playerRepository, GameServices gameServices){
        this.playerRepository = playerRepository;
        this.gameServices = gameServices;
    }

    @Override
    public Player getPlayer(String id) {
        return playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Jugador no encontrado"));
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public List<PlayerDTO> getAllPlayersDTO(){
        List<Player> players = getAllPlayers();
        List<PlayerDTO> playersDTO = new ArrayList<PlayerDTO>();
        players.forEach(p -> playersDTO.add(new PlayerDTO(p.getUsername(), p.getWinRate())));
        return playersDTO;
    }

    @Override
    public GameDTO playGame(String id) {
        Player player = getPlayer(id);
        GameDTO gameDTO = gameServices.addGame(player);
        updateWinRate(player, gameDTO);
        return gameDTO;
    }

    @Override
    public List<GameDTO> getAllGames(String id) {
        return gameServices.getAllGames(getPlayer(id));
    }

    @Override
    public void deleteAllGames(String id) {
        Player player = getPlayer(id);
        gameServices.deleteAllGames(player);
        player.setWinRate(null);
        playerRepository.save(player);
    }

    @Override
    public List<PlayerDTO> getWinRates() {
        List<Player> playersList = getAllPlayers();
        List<PlayerDTO> playersDTOList = new ArrayList<>();
        playersList.forEach(p -> {
            if (p.getWinRate() != null){
                playersDTOList.add(new PlayerDTO(p.getUsername(), p.getWinRate()));
            }
        });
        return playersDTOList;
    }

    @Override
    public double getAVGWinRates() {
        List<Player> players = getAllPlayers();
        Double totalWinRates = players.stream()
                .filter(player -> player.getWinRate() != null)
                .mapToDouble(Player::getWinRate)
                .sum();
        return totalWinRates / (double) players.size();
    }

    @Override
    public PlayerDTO getWinner() {
        return getWinRates().stream()
                .max(Comparator.comparing(PlayerDTO::getWinRate))
                .orElseThrow(() -> new GameNotFoundException("No hay partidas jugadas"));
    }

    @Override

    public PlayerDTO getLoser() {
        return getWinRates().stream()
                .min(Comparator.comparing(PlayerDTO::getWinRate))
                .orElseThrow(() -> new GameNotFoundException("No hay partidas jugadas"));

    }

    @Override
    public PlayerDTO player2DTO(Player player) {
        return new PlayerDTO(player.getUsername(), player.getWinRate());
    }

    @Override
    public void updatePlayer(String id, PlayerDTORequest playerDTO) {
        Player player = getPlayer(id);
        Player playerEntityExisting = playerRepository.findByUsername(playerDTO.getUsername());
        if(playerEntityExisting != null){
            if(playerEntityExisting.getUsername().equalsIgnoreCase(playerDTO.getUsername())){
                throw new UsernameInUsedException("username no disponible");
            }
        }
        player.setUsername(playerDTO.getUsername());
        playerRepository.save(player);

    }

    @Override
    public void addPlayer(PlayerDTORequest playerDTO) {
        if (playerDTO.getUsername() == null){
            playerDTO.setUsername("ANONIMO");
        }
        if(!playerDTO.getUsername().equalsIgnoreCase("ANONIMO")){
            Player playerEntityExisting = playerRepository.findByUsername(playerDTO.getUsername());

            if(playerEntityExisting != null) {
                if (playerEntityExisting.getUsername().equalsIgnoreCase(playerDTO.getUsername())) {
                    throw new UsernameInUsedException("username no disponible");

                }
            }
        }

        Player player = new Player(playerDTO.getUsername());
        playerRepository.save(player);

    }

    @Override
    public Player DTO2Player(PlayerDTORequest player) {
        return new Player((player.getUsername()));
    }

    private void updateWinRate(Player player, GameDTO gameDTO){
        Double winRate = player.getWinRate();
        double victory = 0.0f;
        if(gameDTO.isSeven()){
            victory = 1.0;
        }
        else{
            victory = 0.0;
        }
        if(winRate == null){

            winRate = victory*100;
        }
        else{
            int gamesPlayed = gameServices.getAllGames(player).size();
            int victories = (int) (winRate/(100*gamesPlayed));
            winRate = (victories + victory)*100/(gamesPlayed);
        }

        player.setWinRate(winRate);
        playerRepository.save(player);

    }
}
