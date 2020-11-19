package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
	@Value("${guru.user}")
	String user;
	
	@Value("${guru.password}")
	String password;
	@Value("${guru.dburl}")
	String url;
	
	@Value("${guru.jms.username}")
	String userJMS;
	
	@Value("${guru.jms.password}")
	String passwordJMS;
	@Value("${guru.jms.url}")
	String urlJMS;
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(passwordJMS);
		fakeDataSource.setUrl(urlJMS);
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUser(userJMS);
		fakeJmsBroker.setPassword(password);
		fakeJmsBroker.setUrl(url);
		return fakeJmsBroker;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new  PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
