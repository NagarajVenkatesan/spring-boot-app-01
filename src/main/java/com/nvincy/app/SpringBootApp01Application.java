package com.nvincy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp01Application.class, args);
		System.out.println("Hello world from spring boot application");
	}

}
