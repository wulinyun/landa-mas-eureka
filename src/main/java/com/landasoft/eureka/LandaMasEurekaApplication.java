package com.landasoft.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = "com.landasoft")
@EnableEurekaServer
public class LandaMasEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandaMasEurekaApplication.class, args);
	}
}
