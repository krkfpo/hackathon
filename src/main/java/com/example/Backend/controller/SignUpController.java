package com.example.Backend.controller;

import com.example.Backend.form.SignUpForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SignUpController {

    ArrayList<SignUpForm> users = new ArrayList<>();
    @RequestMapping(path = "/SignUp", method = RequestMethod.POST)
    public String SignUp(SignUpForm signUpForm, BindingResult br)
    {
        if(br.hasErrors()){
            System.out.println(br.getFieldErrors());
            return "redirect:/formError.html";
        }
        System.out.println("Signing Up" + signUpForm.getFname());
        users.add(signUpForm);
        SignUpForm.printArray(users);
        return "redirect:/SignUpComplete.html";
    }


}
