package com.hochschule.bmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Anmoldeep Angadi Manjunatha,
//  Matriculation : 1453520, Date:07/11/2023

@SpringBootApplication
@ComponentScan(basePackages = "com.hochschule.bmi")
public class BmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmiApplication.class, args);
	}

}
