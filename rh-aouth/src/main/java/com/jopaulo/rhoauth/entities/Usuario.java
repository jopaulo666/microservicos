package com.jopaulo.rhoauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable{

	@EqualsAndHashCode.Include
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private Set<Role> roles = new HashSet<>();
}
