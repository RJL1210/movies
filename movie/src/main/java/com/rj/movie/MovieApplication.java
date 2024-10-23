package com.rj.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import io.github.cdimascio.dotenv.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
@RestController
public class MovieApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().directory("./movie").load();
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(MovieApplication.class, args);
	}

}
