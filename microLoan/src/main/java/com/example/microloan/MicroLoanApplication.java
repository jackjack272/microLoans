package com.example.microloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MicroLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroLoanApplication.class, args);
	}

}
