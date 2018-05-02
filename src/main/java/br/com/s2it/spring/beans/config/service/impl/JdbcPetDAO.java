package br.com.s2it.spring.beans.config.service.impl;

import br.com.s2it.spring.beans.config.service.PetDAO;

public class JdbcPetDAO implements PetDAO {

	@Override
	public void gravar() {
		System.out.println("c=JdbcPetDAO m=Pet gravado com sucesso");
	}

}
