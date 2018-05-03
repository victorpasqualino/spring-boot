package br.com.s2it.spring.boot.service.impl;

import org.springframework.stereotype.Repository;

import br.com.s2it.spring.boot.pojo.Usuario;
import br.com.s2it.spring.boot.service.UsuarioDao;

@Repository
public class JdbcUsuarioDao implements UsuarioDao {

	@Override
	public Usuario findById(Long id) {
		return new Usuario(id, "usuario1", "teste");
	}

}
