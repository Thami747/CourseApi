package com.thami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableJpaRepositories(basePackages = "com.thami.course.topic", entityManagerFactoryRef = "sessionFactory")
public class CoureseApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoureseApiAppApplication.class, args);
	}
}
