package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello() { 
		return "Hello Turma 44";
		
	}
	
	@GetMapping ("/turma44")
	public String getHello2() { 
		return "A Turma 44 é TOP!";
		
	}
		
		@GetMapping ("/habilidades")
		public String getHabilidades() { 
			return "As habilidades e mentalidades que utiizei para relizar essa atividade foram, respectivamente, atenção aos detalhes e persistência";
			
		}
			
			@GetMapping ("/objetivos")
			public String getObjetivos() { 
				return "Meus objetivos de aprenndizagem para essa semana são dar andamento ao projeto do Blog Pessoal e assimilar bem o novo conteúdo";
		
	}
	
}
