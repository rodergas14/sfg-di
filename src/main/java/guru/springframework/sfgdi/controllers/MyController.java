package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService  greetingService;
	
	public MyController(GreetingService  greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {

		return greetingService.sayGreeting();
	}
}
