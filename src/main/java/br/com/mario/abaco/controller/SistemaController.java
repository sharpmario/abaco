package br.com.mario.abaco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.mario.abaco.model.Sistema;
import br.com.mario.abaco.repository.SistemaRepository;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
	
	@Autowired
	private SistemaRepository repo;
	
	@GetMapping
	public String pesquisar(){
		return "sistemas";
	}
	
	@RequestMapping("/novo")
	public ModelAndView nova(){
		ModelAndView mv = new ModelAndView("novo-sistema");
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView salvar(Sistema sistema){
		ModelAndView mv = new ModelAndView("novo-sistema");
		repo.save(sistema);
		mv.addObject("mensagem","Análise salva com sucesso!");
		return mv;
	}
	

}