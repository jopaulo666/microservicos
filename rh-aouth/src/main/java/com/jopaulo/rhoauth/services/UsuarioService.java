package com.jopaulo.rhoauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jopaulo.rhoauth.entities.Usuario;
import com.jopaulo.rhoauth.feignclients.UsuarioFeingClient;

@Service
public class UsuarioService {

	private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private UsuarioFeingClient usuarioFeingClient;
	
	public Usuario findByEmail (String email) {
		Usuario usuario = usuarioFeingClient.findByEmail(email).getBody();		
		if (usuario == null) {
			logger.error("E-mail não encontrado: " + email);
			throw new IllegalArgumentException("E-mail não encontrado");
		}
		logger.info("E-mail encontrado: " + email);
		return usuario;
	}
}
