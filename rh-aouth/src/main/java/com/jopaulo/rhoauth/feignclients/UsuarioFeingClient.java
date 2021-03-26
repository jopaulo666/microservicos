package com.jopaulo.rhoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jopaulo.rhoauth.entities.Usuario;

@Component
@FeignClient(name = "rh-usuario", path = "/usuarios")
public interface UsuarioFeingClient {

	@GetMapping(value = "/procurar")
	ResponseEntity<Usuario> findByEmail(@RequestParam String email);
}
