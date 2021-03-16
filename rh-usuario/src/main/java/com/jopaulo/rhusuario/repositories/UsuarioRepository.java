package com.jopaulo.rhusuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopaulo.rhusuario.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByEmail(String email);
}
