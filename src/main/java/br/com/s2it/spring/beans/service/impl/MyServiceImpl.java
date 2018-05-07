package br.com.s2it.spring.beans.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.s2it.spring.beans.service.MyService;
import br.com.s2it.spring.beans.service.PetDao;

@Component
@Scope("singleton")
public class MyServiceImpl implements MyService {
	
	private int counter = 0;
	
	private PetDao petDao;
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroyed() {
		System.out.println("destroyed");
	}

	@Autowired
	public MyServiceImpl(@Qualifier("dynamic") PetDao petDao) {
		this.petDao = petDao;
	}

	@Override
	public void doStuff() {
		petDao.gravar();
		System.out.println("counter=" + ++counter);
	}

}
