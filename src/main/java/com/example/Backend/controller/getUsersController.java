package com.example.Backend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class getUsersController {
    @GetMapping("/processFormGetSignedUpUsers")
    public String greeting(@RequestParam(name="fname", required=false, defaultValue="World") String name,
                           @RequestParam(name="email", required=false, defaultValue="World")
                                   Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

//    @RequestMapping(path="/processFormGetSignedUpUsers")
//    public String getFormProcessor(@RequestParam(value="fname")
//                                           String firstNameString, @RequestParam(value="email") String Email)
//    {
//        return "Data on "+firstNameString+" "+Email;
//    }









