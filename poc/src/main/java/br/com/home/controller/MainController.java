package br.com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("admin");
		return model;
	}
	
	@RequestMapping(value = "/index**", method = RequestMethod.GET)
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/protected/editarUsuario**", method = RequestMethod.GET)
	public ModelAndView usuario() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/protected/editarUsuario");
		return model;
	}
	
	@RequestMapping(value = "/protected/solicitarServicos**", method = RequestMethod.GET)
	public ModelAndView solicitarServico() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/protected/solicitarServicos");
		return model;
	}
	
	@RequestMapping(value = "/protected/meusServicos**", method = RequestMethod.GET)
	public ModelAndView meusServicos() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/protected/meusServicos");
		return model;
	}
	
	@RequestMapping(value = "/protected/notas**", method = RequestMethod.GET)
	public ModelAndView notas() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/protected/notas");
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Usuário ou Senha Inválidos!");
		}

		if (logout != null) {
			model.addObject("msg", "Logout");
		}
		model.setViewName("login");
		return model;
	}
}
