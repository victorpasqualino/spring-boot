package br.com.s2it.spring.beans.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.s2it.spring.beans.service.PetDao;

@Repository
@Qualifier("jpa")
public class JpaPetDao implements PetDao {
	
	@Override
	public void gravar() {
		System.out.println("c=JpaPetDAO m=Pet gravado com sucesso");
	}

}
