package br.com.s2it.spring.beans.config.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.s2it.spring.beans.config.service.MyService;
import br.com.s2it.spring.beans.config.service.PetDAO;

@Service
@Scope("singleton")
public class MyServiceImpl implements MyService {
	
	private PetDAO petDAO;
	
	@Autowired
	public MyServiceImpl(PetDAO petDAO) {
		this.petDAO = petDAO;
	}

	@Override
	public void doStuff() {
		petDAO.gravar();
	}

}
