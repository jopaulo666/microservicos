package com.jopaulo.rhpagamento.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Trabalhador implements Serializable{

	@EqualsAndHashCode.Include
	private Long id;
	private String nome;
	private Double diaTrabalhado;
}
