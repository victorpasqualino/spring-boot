package br.com.s2it.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.s2it.spring.beans.service.MyService;

public class JavaBasedApplicationContext {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService = context.getBean(MyService.class);
		myService.doStuff();
	}
	
	@Configuration
	@ComponentScan(basePackages = "br.com.s2it.spring.beans.service.impl")
	public static class AppConfig {
		
	}

}
