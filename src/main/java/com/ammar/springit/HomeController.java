package com.ammar.springit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }
}
