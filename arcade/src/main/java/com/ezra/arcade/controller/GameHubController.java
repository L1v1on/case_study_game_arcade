package com.ezra.arcade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameHubController {

    @RequestMapping("/gameHub")
    public String showGameHubPage(){
        return "gameHub";
    }
}
