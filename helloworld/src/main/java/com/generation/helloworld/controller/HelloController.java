package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>BSM's da Generation Brasil</b> <br /> <br /> Mentalidade de Crescimento"
				+ "<br />Persistência"
				+ "<br />Responsabilidade Pessoal"
				+ "<br />Orientação ao Futuro"
				+ "<br />Comunicação"
				+ "<br />Orientação ao Detalhe"
				+ "<br />Proatividade"
				+ "<br />Trabalho em Equipe";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Meus objetivos para esta semana são:</b>  <br />"
				+ "<br />Aprender à como usar o Spring Boot;"
				+ "<br />Avançarmos no projeto integrador;"
				+ "<br />Aprender Banco de dados.";
}
}
