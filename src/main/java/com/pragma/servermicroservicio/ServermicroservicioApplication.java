package com.pragma.servermicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServermicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServermicroservicioApplication.class, args);
	}

}
