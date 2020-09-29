package com.tcs.employeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableEurekaServer
@EnableAdminServer
@SpringBootApplication
public class EmployeeManagementRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRegistryServerApplication.class, args);
	}

}
