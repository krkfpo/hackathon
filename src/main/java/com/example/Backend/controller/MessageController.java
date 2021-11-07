package com.example.Backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

public class MessageController {

    ArrayList<MessageForm> messageForms = new ArrayList<>();

    @RequestMapping(path = "/processMessageForm", method = RequestMethod.POST)
    public ModelAndView messagePostFormProcessor(MessageForm messageForm) {
        ModelAndView subsMav = new ModelAndView();
        subsMav.addObject("name", messageForm.getName());
        subsMav.addObject("email", messageForm.getEmail());
        subsMav.setViewName("messageReply");
        return subsMav;
    }
}

