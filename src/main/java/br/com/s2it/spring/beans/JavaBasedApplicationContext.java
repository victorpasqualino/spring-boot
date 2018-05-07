package br.com.s2it.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.s2it.spring.beans.service.MyService;
import br.com.s2it.spring.beans.service.PetDao;
import br.com.s2it.spring.beans.service.impl.DummyDao;
import br.com.s2it.spring.beans.service.impl.JdbcPetDao;
import br.com.s2it.spring.beans.service.impl.JpaPetDao;

public class JavaBasedApplicationContext {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService = context.getBean(MyService.class);
		myService.doStuff();
		
//		MyService service = new MyServiceImpl(null);
//		service.doStuff();
	}
	
	@Configuration
	@ComponentScan(basePackages = "br.com.s2it.spring.beans.service.impl")
	public static class AppConfig {
		
		@Autowired
		private DummyDao dummyDao;
		@Autowired
		private JdbcPetDao jdbcPetDao;
		@Autowired
		private JpaPetDao jpaPetDao;
		
		private boolean teste = true;
		
		@Bean @Qualifier("dynamic")
		public PetDao cretePetDao() {
			return teste ? dummyDao : new JpaPetDao(); 
		}
		
	}

}
