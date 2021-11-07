package com.example.Backend.controller;

import java.util.ArrayList;

public class MessageForm {
    String name;
    String email;

    public MessageForm (String name, String email){
        this.name = name;
        this.email = email;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void printArrayListOfSubsForms(ArrayList<MessageForm> messenger){
        for (MessageForm n:messenger){
            System.out.println(n.getName()+", "+n.getEmail());
        }
    }



}
