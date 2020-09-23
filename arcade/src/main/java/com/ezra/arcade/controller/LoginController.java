package com.ezra.arcade.controller;

import com.ezra.arcade.model.Player;
import com.ezra.arcade.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    PlayerService playerService;

    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(ModelMap model, @RequestParam String username, @RequestParam String password){
        // TODO: validate user
        Player playerLogin = playerService.getPlayer(username);
        if(playerLogin.getUsername().equals(username) && playerLogin.getPassword().equals(password)){
            return "gameHub";
        }
        return "login"; // TODO: return to page with some error message
    }
}
