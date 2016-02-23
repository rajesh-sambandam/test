package com.example;

import org.springframework.stereotype.Service;

@Service
public class SpringBean {

	private String welcomeMessage = "Populated by spring created bean";

	public String getWelcomeMessage() {
		return welcomeMessage;
	}
}
