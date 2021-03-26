package com.jopaulo.rhoauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jopaulo.rhoauth.entities.Usuario;
import com.jopaulo.rhoauth.services.UsuarioService;

@RestController
@RequestMapping(value = "usuarios")
public class UsuarioResources {

	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/procurar")
	public ResponseEntity<Usuario> findByEmail(@RequestParam String email){
		try {
			Usuario usuario = service.findByEmail(email);
			return ResponseEntity.ok(usuario);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
}
