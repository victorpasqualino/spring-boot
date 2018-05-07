package br.com.s2it.spring.beans.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.s2it.spring.beans.service.PetDao;

//@Primary
@Repository
@Qualifier("jdbc")
public class JdbcPetDao implements PetDao {

	@Override
	public void gravar() {
		System.out.println("c=JdbcPetDAO m=Pet gravado com sucesso");
	}

}
