package br.com.s2it.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.s2it.spring.boot.pojo.Usuario;
import br.com.s2it.spring.boot.service.UsuarioService;

@RestController
@RequestMapping(path = "usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Usuario findById(@PathVariable(name = "id") Long id) {
		return usuarioService.find(id);
	}

}
