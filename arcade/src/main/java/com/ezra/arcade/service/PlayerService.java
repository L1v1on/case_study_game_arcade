package com.ezra.arcade.service;

import com.ezra.arcade.model.Player;
import com.ezra.arcade.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        List<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }

    public Player getPlayer(Integer id){
        return playerRepository.findById(id).get();
    }

    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    public void updatePlayer(Player player, Integer id) {
        playerRepository.save(player);
    }

    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }
}
