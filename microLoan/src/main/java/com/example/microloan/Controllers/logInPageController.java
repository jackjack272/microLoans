package com.example.microloan.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
@Controller
public class logInPageController {


    @GetMapping(path = "/")
    public String getFirstpage(){


        return "here";
    }



}

