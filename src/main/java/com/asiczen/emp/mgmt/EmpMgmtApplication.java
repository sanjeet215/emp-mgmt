package com.asiczen.emp.mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.asiczen.emp.mgmt.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class EmpMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMgmtApplication.class, args);
	}

}
