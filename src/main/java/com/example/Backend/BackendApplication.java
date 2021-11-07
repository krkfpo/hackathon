package com.example.Backend;

import com.example.Backend.controller.MessageForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class BackendApplication {
	public static ArrayList<MessageForm> messengers = new ArrayList<MessageForm>();
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	public static String messengersToString() {
		String messengerString = "";
		for (int i = 0; i < messengers.size(); i++) {
			System.out.println(messengers.get(i).getName());
			messengerString = messengerString.concat( messengers.get(i).getName()+" "+
					messengers.get(i).getEmail()+"; ");
		}
		return messengerString;
	}

}
