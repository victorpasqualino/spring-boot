package br.com.s2it.spring.boot.service;

import br.com.s2it.spring.boot.pojo.Usuario;

public interface UsuarioDao {
	
	Usuario findById(Long id);

}
