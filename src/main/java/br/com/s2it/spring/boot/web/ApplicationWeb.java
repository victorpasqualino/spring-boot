package br.com.s2it.spring.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import br.com.s2it.spring.boot.config.AppConfiguration;

@SpringBootApplication
@Import({AppConfiguration.class})
public class ApplicationWeb {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationWeb.class, args);
	}
	
}
