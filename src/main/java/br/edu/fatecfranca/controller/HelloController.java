package br.edu.fatecfranca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Classe responsável por controlar as requisições feitas nas APIs
@RestController
public class HelloController {
	//vamos criar um método para responder a requisição get /saudacao
	@GetMapping ("/saudacao") 
	public String saudacao(){
		return "Bom dia";
	}
	
	//vamos criar um método para responder a requisição get /saudacao/nome
	@GetMapping("saudacao/{nome}")
	public String saudacao(@PathVariable("nome")String nome) {
		return "Bom dia " + nome;
		
	}
	

}
