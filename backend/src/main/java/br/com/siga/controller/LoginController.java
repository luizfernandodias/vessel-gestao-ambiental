package br.com.siga.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.siga.dominio.DominioPapel;

@Controller
public class LoginController {

	@Secured({DominioPapel.ROLE_ADMIN})
	@RequestMapping	("/login")
	public ModelAndView home() {
		return new ModelAndView("login");
	}
}
