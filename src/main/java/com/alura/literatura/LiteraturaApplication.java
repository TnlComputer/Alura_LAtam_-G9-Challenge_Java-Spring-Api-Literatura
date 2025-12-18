package com.alura.literatura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LiteraturaApplication {

	public static void main(String[] args) {

        SpringApplication.run(LiteraturaApplication.class, args);
	}

    // Bean de RestTemplate para consumir Gutendex si lo usás.
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
