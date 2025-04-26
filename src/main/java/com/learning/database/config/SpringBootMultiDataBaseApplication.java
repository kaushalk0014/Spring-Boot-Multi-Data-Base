package com.learning.database.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories 
@ComponentScan(basePackages ="com.learning.database")
@EntityScan(value = "com.learning.database.entiry")
@SpringBootApplication
public class SpringBootMultiDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultiDataBaseApplication.class, args);
	}

}
