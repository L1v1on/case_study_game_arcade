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
public class RegisterController {
    @Autowired
    PlayerService playerService;

    @RequestMapping("/register")
    public String showRegisterPage(){
        return "register";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doLogin(ModelMap model,
                          @RequestParam String username,
                          @RequestParam String password,
                          @RequestParam String initials){
        // TODO: create Player object, put in database, send to gameHub page
        Player playerRegister = new Player(username, password, initials);
        playerService.addPlayer(playerRegister);
        model.put("Message", "Account Created!!!");
        return "login"; // TODO: return to page with some error message
    }
}
