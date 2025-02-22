package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.demo.model.persistence.repositories")
@EntityScan("com.example.demo.model.persistence")
@SpringBootApplication
public class SareetaApplication {

	//Test comment
	//Test Comment 2
	//Test comment 3 & 4
	public static void main(String[] args) {
		SpringApplication.run(SareetaApplication.class, args);
	}

}
