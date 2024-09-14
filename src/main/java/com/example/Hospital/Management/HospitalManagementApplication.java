package com.example.Hospital.Management;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalManagementApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		SpringApplication.run(HospitalManagementApplication.class, args);
	}

}
