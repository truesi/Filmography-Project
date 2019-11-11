package com.retake.filmography.FilmographyAuthService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FilmographyAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmographyAuthServiceApplication.class, args);
	}

}
