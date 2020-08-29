package br.com.siga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.siga.dominio.DominioPapel;
import br.com.siga.entity.Licenca;
import br.com.siga.repository.LicencaRepository;

@Controller
@RequestMapping("/licenca")
public class LicencaController {
	
	@Autowired
	private LicencaRepository licencaRepository;
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST,	produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    @Secured({DominioPapel.ROLE_CLIENTE, DominioPapel.ROLE_ADMIN})
	public void salvar(@RequestBody Licenca licenca) {

	}
	

}
