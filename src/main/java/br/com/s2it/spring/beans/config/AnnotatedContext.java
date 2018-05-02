package br.com.s2it.spring.beans.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.s2it.spring.beans.config.service.MyService;

public class AnnotatedContext {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	    MyService myService = ctx.getBean(MyService.class);
	    myService.doStuff();
	    
	    myService = ctx.getBean(MyService.class);
	    myService.doStuff();
	    
	    myService = ctx.getBean(MyService.class);
	    myService.doStuff();
	    
	    myService = ctx.getBean(MyService.class);
	    myService.doStuff();
	}

}
