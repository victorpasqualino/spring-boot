package br.com.s2it.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.s2it.spring.boot.service.PagseguroFaqService;
import br.com.s2it.spring.boot.service.impl.PagseguroFaqServiceImpl;

@Configuration
@ComponentScan({ "br.com.s2it.spring.boot" })
public class AppConfiguration {
	
	@Value("${pagseguro.faq.url}")
	private String pagseguroFaqUrl;
	
	@Bean
	public PagseguroFaqService pagseguroFaqService() {
		return new PagseguroFaqServiceImpl(pagseguroFaqUrl);
	}

}
