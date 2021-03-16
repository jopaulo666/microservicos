package com.jopaulo.rhoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhAouthApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhAouthApplication.class, args);
	}

}
