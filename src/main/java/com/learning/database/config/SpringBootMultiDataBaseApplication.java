package com.learning.database.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.learning.database")
@SpringBootApplication
public class SpringBootMultiDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultiDataBaseApplication.class, args);
	}

}
