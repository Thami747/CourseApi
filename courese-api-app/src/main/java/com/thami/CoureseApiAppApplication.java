package com.thami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableJpaRepositories(basePackages = "com.thami.course.topic", entityManagerFactoryRef = "sessionFactory")
public class CoureseApiAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CoureseApiAppApplication.class, args);
	}

	//If you need a traditional war deployment we need to extend the SpringBootServletInitializer
	//This helps us deploy war files to Jboss containers
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(CoureseApiAppApplication.class);
	}
}
