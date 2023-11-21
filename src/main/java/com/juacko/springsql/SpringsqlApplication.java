package com.juacko.springsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.juacko.springsql"})
public class SpringsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsqlApplication.class, args);
	}

}
