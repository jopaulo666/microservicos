package com.jopaulo.rhpagamento.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pagamento implements Serializable{

	private String nome;
	private Double diaTrabalhado;
	private Integer dias;
	
	public double getTotal() {
		return dias * diaTrabalhado;
	}	
}
