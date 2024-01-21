package com.hopital.pfaspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {



   /* @GetMapping("/index")
    public String index(){
        return "index" ;
    }*/

/*
    @GetMapping("/_layout")
    public String widget(){
        return "_layout" ;
    }
*/
    @GetMapping("/home")
    public String home(){
        return "assets/home" ;
    }


}
