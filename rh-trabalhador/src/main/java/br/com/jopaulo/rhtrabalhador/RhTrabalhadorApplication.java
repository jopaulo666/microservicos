package br.com.jopaulo.rhtrabalhador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhTrabalhadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhTrabalhadorApplication.class, args);
	}

}
