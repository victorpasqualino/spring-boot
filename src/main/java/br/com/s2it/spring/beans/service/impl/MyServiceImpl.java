package br.com.s2it.spring.beans.service.impl;

import br.com.s2it.spring.beans.service.MyService;
import br.com.s2it.spring.beans.service.PetDao;

public class MyServiceImpl implements MyService {
	
	private PetDao petDao;
	
	public MyServiceImpl(PetDao petDao) {
		this.petDao = petDao;
	}

	@Override
	public void doStuff() {
		petDao.gravar();
	}

}
