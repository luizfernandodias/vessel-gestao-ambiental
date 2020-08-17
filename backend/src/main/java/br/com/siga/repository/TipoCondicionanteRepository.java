package br.com.siga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siga.entity.TipoCondicionante;

public interface TipoCondicionanteRepository extends JpaRepository<TipoCondicionante, Integer> {

	@Override
    List<TipoCondicionante> findAll();
	
}
