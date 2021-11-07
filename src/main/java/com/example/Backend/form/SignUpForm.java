package com.example.Backend.form;

import java.util.ArrayList;

public class SignUpForm {
    String fname;
    String email;
    public SignUpForm(String fname, String email)
    {
        this.fname = fname;
        this.email = email;
    }

    public static void printArray(ArrayList<SignUpForm> users)
    {
        for (SignUpForm u:users)
        {
            System.out.println(u.getFname() + " " + u.getEmail());
        }
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
