package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;
	
	@Autowired
	public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
