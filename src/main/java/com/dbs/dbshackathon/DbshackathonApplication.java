package com.dbs.dbshackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = "com.dbs.dbshackathon")
@EnableJpaRepositories(basePackages="com.dbs.dbshackathon.Repository")
@EnableSwagger2
public class DbshackathonApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DbshackathonApplication.class, args);
	}
	
	
}
