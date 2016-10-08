package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistema.model.Cachaca;
import br.com.sistema.repository.Cachacas;
import br.com.sistema.service.CachacaService;

@Controller
public class CachacaController {
	
	
	@Autowired
	private CachacaService cachacaService;
	
	@Autowired
	private Cachacas cachacas;

	@RequestMapping(value="/novo", method = RequestMethod.POST)
	public ModelAndView salvar(Cachaca cachaca) {
		
		cachacaService.salvar(cachaca);
		return new ModelAndView("redirect:/novo");
	}
	
	@RequestMapping(value="/novo", method=RequestMethod.GET)
	public String formulario(Cachaca cachaca){
		return "Cadastro";
	}
	
	@RequestMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("Lista");
		mv.addObject("cachacas", cachacas.findAll());
		return mv;
	}
}
