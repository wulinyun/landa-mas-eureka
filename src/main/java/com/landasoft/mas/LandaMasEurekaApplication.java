package com.landasoft.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LandaMasEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandaMasEurekaApplication.class, args);
	}
}
