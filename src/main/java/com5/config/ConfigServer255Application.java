package com5.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer255Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer255Application.class, args);
	}

}
