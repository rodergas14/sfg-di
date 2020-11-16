package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.sfgdi.repositories.GreetingRepository;

public class PrimaryGreetingService implements GreetingService {

	 private GreetingRepository greetingRepository;

	    public PrimaryGreetingService(GreetingRepository greetingRepository) {
	        this.greetingRepository = greetingRepository;
	    }

	    @Override
	    public String sayGreeting() {
	        return greetingRepository.getEnglishGreeting();
	    }

}
