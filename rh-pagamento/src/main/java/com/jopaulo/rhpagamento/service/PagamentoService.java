package com.jopaulo.rhpagamento.service;

import org.springframework.stereotype.Service;

import com.jopaulo.rhpagamento.entities.Pagamento;

@Service
public class PagamentoService {

	public Pagamento getPagamento(long trabalhadorId, int dias) {
		return new Pagamento();
	}
}
