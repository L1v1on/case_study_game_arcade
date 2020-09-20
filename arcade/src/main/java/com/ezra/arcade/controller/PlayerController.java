package com.ezra.arcade.controller;

import com.ezra.arcade.model.Player;
import com.ezra.arcade.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @RequestMapping("/player/{id}")
    public Player getPlayer(@PathVariable Integer id){
        return playerService.getPlayer(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/player")
    public void addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/player/{id}")
    public void updatePlayer(@RequestBody Player player, @PathVariable Integer id){
        playerService.updatePlayer(player, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/player/{id}")
    public void deletePlayer(@PathVariable Integer id){
        playerService.deletePlayer(id);
    }
}
