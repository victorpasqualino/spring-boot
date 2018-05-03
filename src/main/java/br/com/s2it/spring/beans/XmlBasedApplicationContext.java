package br.com.s2it.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.s2it.spring.beans.service.MyService;

public class XmlBasedApplicationContext {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		MyService myService = context.getBean(MyService.class);
		myService.doStuff();
	}

}
