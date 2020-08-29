package br.com.siga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.siga.dominio.DominioPapel;
import br.com.siga.entity.TipoCondicionante;
import br.com.siga.repository.TipoCondicionanteRepository;

@Controller
@RequestMapping("/tipo-condicionante")
public class TipoCondicionanteController {
	
	@Autowired
	private TipoCondicionanteRepository tipoCondicionanteRepository;
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST,	produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    @Secured({DominioPapel.ROLE_CLIENTE, DominioPapel.ROLE_ADMIN})
	public void salvar(@RequestBody TipoCondicionante tipoCondicionante) {
		tipoCondicionanteRepository.save(tipoCondicionante);
		tipoCondicionanteRepository.flush();
	}
	
	@RequestMapping(value= "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
    @Secured({DominioPapel.ROLE_CLIENTE, DominioPapel.ROLE_ADMIN})
	public List<TipoCondicionante> listar(){
		List<TipoCondicionante> lista = tipoCondicionanteRepository.findAll();
		return lista;
	}	

}