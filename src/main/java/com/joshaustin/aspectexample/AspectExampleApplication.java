package com.joshaustin.aspectexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.joshaustin.aspectexample"})
public class AspectExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectExampleApplication.class, args);
	}

}
