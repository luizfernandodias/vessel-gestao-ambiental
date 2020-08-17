package br.com.siga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.siga.repository.LicencaRepository;
import br.com.siga.repository.TipoCondicionanteRepository;

@Controller
@RequestMapping("/licenca")
public class LicencaController {
	
	@Autowired
	private LicencaRepository licencaRepository;
	

}
