package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello world - EN";
	}

}
