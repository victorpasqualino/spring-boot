package br.com.s2it.spring.beans.service.impl;

import org.springframework.stereotype.Repository;

import br.com.s2it.spring.beans.service.PetDao;

@Repository
public class DummyDao implements PetDao {

	@Override
	public void gravar() {
		System.out.println("c=DummyDao");
	}

}
