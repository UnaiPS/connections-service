package com.springboot.app.connections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.springboot.app.commons.models.entity"})
public class ConnectionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionsServiceApplication.class, args);
	}

}
