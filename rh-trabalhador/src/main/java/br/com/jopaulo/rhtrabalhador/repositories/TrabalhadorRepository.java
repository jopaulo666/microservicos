package br.com.jopaulo.rhtrabalhador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jopaulo.rhtrabalhador.entities.Trabalhador;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long>{

}
