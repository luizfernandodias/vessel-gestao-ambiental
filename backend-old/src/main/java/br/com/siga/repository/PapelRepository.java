package br.com.siga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.siga.entity.Papel;

public interface PapelRepository extends JpaRepository<Papel, Integer>{
	
	public Papel findByNomePapel(String nome);

}
