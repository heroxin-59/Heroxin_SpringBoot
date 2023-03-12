package com.heroxin.controller;

/*
    @Author Heroxin
    
    @Create 2023-03-11-11:25

    @Description:
*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class ToLoginPage {
    @GetMapping("/toLogPage")
    public String tologpage(Model model) {
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        System.err.println("hhhhhhhhhhhhhh");
        return "login";
    }
}
