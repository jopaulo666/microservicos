package br.com.jopaulo.rhtrabalhador.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jopaulo.rhtrabalhador.entities.Trabalhador;
import br.com.jopaulo.rhtrabalhador.repositories.TrabalhadorRepository;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResources {
	
	@Value("${test.config}")
	private String testConfig;
	
	@Autowired
	private static Logger logger = LoggerFactory.getLogger(TrabalhadorResources.class);
	
	@Autowired
	private Environment env;

	@Autowired
	private TrabalhadorRepository repository;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigd(){
		logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAll(){
		List<Trabalhador> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id){
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Trabalhador obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
