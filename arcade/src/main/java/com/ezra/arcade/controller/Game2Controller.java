package com.ezra.arcade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Game2Controller {

    @RequestMapping("/game2")
    public String showGame1Page(){
        return "game2";
    }
}