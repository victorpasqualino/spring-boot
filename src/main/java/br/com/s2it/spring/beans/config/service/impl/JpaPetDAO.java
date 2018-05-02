package br.com.s2it.spring.beans.config.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import br.com.s2it.spring.beans.config.service.PetDAO;

@Repository
@Scope("prototype")
public class JpaPetDAO implements PetDAO {
	
	private int quantidadeGravacoes = 0;

	@Override
	public void gravar() {
		System.out.println("c=JpaPetDAO m=Pet gravado com sucesso v=" + ++quantidadeGravacoes);
	}

}
