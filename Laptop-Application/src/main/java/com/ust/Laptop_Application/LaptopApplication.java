package com.ust.Laptop_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ust.Laptop_Application", "com.speedment.jpastreamer"})
public class LaptopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopApplication.class, args);
	}

}
