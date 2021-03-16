package com.jopaulo.rhusuario.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jopaulo.rhusuario.entities.Usuario;
import com.jopaulo.rhusuario.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository repository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/procurar")
	public ResponseEntity<Usuario> findById(@RequestParam String email) {
		Usuario obj = repository.findByEmail(email);
		return ResponseEntity.ok(obj);
	}

}
