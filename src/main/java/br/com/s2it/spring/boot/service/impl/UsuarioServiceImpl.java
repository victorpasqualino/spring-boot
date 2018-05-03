package br.com.s2it.spring.boot.service.impl;

import org.springframework.stereotype.Service;

import br.com.s2it.spring.boot.pojo.Usuario;
import br.com.s2it.spring.boot.service.UsuarioDao;
import br.com.s2it.spring.boot.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioDao usuarioDao;
	
	public UsuarioServiceImpl(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	@Override
	public Usuario find(Long id) {
		return usuarioDao.findById(id);
	}

}
