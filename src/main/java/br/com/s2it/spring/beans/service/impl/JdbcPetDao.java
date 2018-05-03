package br.com.s2it.spring.beans.service.impl;

import br.com.s2it.spring.beans.service.PetDao;

public class JdbcPetDao implements PetDao {

	@Override
	public void gravar() {
		System.out.println("c=JdbcPetDAO m=Pet gravado com sucesso");
	}

}
