package com.jopaulo.rhpagamento.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jopaulo.rhpagamento.entities.Pagamento;
import com.jopaulo.rhpagamento.entities.Trabalhador;

@Service
public class PagamentoService {
	
	@Value("${rh-trabalhador.host}")
	private String trabalhadorHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Pagamento getPagamento(long trabalhadorId, int dias) {
		Map<String, String> uriVaribles = new HashMap<>();
		uriVaribles.put("id", ""+trabalhadorId);
		
		Trabalhador trabalhador = restTemplate.getForObject(trabalhadorHost + "/trabalhadores/{id}", Trabalhador.class, uriVaribles);  
		return new Pagamento(trabalhador.getNome(), trabalhador.getDiaTrabalhado(), dias);
	}
}
