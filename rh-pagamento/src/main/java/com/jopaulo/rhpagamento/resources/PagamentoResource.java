package com.jopaulo.rhpagamento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jopaulo.rhpagamento.entities.Pagamento;
import com.jopaulo.rhpagamento.service.PagamentoService;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {
	
	@Autowired
	private PagamentoService service;
	
	@GetMapping(value = "/{trabalhadorId}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias){
		Pagamento pagamento  = service.getPagamento(trabalhadorId, dias);
		return ResponseEntity.ok(pagamento);
	}
}
