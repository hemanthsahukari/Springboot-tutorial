package com.example.Springboot.tutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    //@RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String Helloworld(){
        return "Welcome to springboot application ";
    }


}
