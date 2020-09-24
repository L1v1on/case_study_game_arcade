package com.ezra.arcade.controller;

import com.ezra.arcade.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Game1Controller {

    @RequestMapping("/game1")
    public String showGame1Page(){
        return "game1";
    }
}
