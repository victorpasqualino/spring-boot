package br.com.s2it.spring.boot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

import br.com.s2it.spring.boot.config.AppConfiguration;
import br.com.s2it.spring.boot.pojo.Usuario;
import br.com.s2it.spring.boot.service.UsuarioService;

@Import({AppConfiguration.class})
public class ApplicationStandalone {
	
	@Autowired
	public UsuarioService usuarioService;
	
	@PostConstruct
	public void init() {
		Usuario find = usuarioService.find(12L);
		System.out.println("Usuario=" + find.toString());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStandalone.class, args);
	}
	
}
