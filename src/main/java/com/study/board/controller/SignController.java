package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {

    @GetMapping("/board/sign")
    public String Sing(){

        return "signup";
    }
    @GetMapping("/board/login")
    public String Login(){

        return "login";
    }
}
