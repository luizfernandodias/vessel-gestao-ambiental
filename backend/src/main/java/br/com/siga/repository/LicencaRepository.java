package br.com.siga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.siga.entity.Licenca;

@Repository
public interface LicencaRepository extends JpaRepository<Licenca, Integer>{

}
