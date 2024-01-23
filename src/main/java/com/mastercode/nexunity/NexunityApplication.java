package com.mastercode.nexunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mastercode.nexunity")
public class NexunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexunityApplication.class, args);
	}

}