package com.course.provider.namingregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class NamingRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingRegistryServerApplication.class, args);
	}

}
