package br.com.siga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.siga.dominio.DominioPapel;
import br.com.siga.entity.TipoCondicionante;
import br.com.siga.service.TipoCondicionanteService;

@Controller
public class TipoCondicionanteController {

	@Autowired
	private TipoCondicionanteService tipoCondicionanteService;
	
	@RequestMapping(value = "/tipo-condicionante/salvar", method = RequestMethod.POST)
    @ResponseBody
    @Secured({DominioPapel.ROLE_CLIENTE, DominioPapel.ROLE_ADMIN})
	public void salvar(@RequestBody TipoCondicionante tipoCondicionante) {
		System.out.println("_______________________________________________");
		System.out.println("Chamei o método");
		System.out.println("_______________________________________________");
		this.tipoCondicionanteService.salvar(tipoCondicionante);
	}
}
