package br.com.s2it.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.s2it.spring.boot.service.UsuarioService;

//@RestController
//@RequestMapping(path = "usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
//	@RequestMapping(path = "{id}", method = RequestMethod.GET)
//	public Usuario findById(@PathVariable(name = "id") Long id) {
//		return usuarioService.find(id);
//	}

}
