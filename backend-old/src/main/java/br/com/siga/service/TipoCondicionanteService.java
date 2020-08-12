package br.com.siga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siga.entity.TipoCondicionante;
import br.com.siga.repository.TipoCondicionanteRepository;

@Service
public class TipoCondicionanteService {

	@Autowired
	private TipoCondicionanteRepository tipoCondicionanteRepository;
	
	public void salvar(TipoCondicionante tipoCondicionante) {
		this.tipoCondicionanteRepository.save(tipoCondicionante);
		this.tipoCondicionanteRepository.flush();
	}
}
