package com.academic.service.academicregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class AcademicRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicRegistrationApplication.class, args);
	}

}
