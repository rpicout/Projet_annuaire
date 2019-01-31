package fr.ima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("fr.ima")
public class WSConfig {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
