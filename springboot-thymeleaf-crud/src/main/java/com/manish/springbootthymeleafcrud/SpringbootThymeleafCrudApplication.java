package com.manish.springbootthymeleafcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootThymeleafCrudApplication/* extends SpringBootServletInitializer */{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafCrudApplication.class, args);
	}

	/*@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(SpringbootThymeleafCrudApplication.class);
	 }*/

}
