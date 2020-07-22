package br.com.siga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@RequestMapping(value= {"/"}, method = RequestMethod.GET)
	public ModelAndView main(){
		return new ModelAndView("redirect:/login");
	}
	
	@RequestMapping(value= {"/login/recuperar"}, method = RequestMethod.POST)
	public ModelAndView recuperarSenha() {
		System.out.println("Chamei o método");
		return new ModelAndView("redirect:/login");
	}
}
